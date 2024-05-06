package be.alexandre01.universal.material;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;


public abstract class AbstractUItemData {

    @Getter private final static Map<String, AbstractUItemData> itemDataMap = new HashMap<>();

    protected final Material material;

    @Setter(AccessLevel.PACKAGE) @Getter private byte legacyDataShort;
    @Getter private final String legacyNameID;
    @Getter private final String modernNameID;




    public AbstractUItemData(AbstractUItemData replacement, String nameID) {
        this.modernNameID = nameID;
        this.legacyDataShort = replacement.getLegacyDataShort();


        this.material = UMaterial.matchMaterial(replacement.getLegacyNameID(), nameID);
        this.legacyNameID = replacement.getLegacyNameID();

        itemDataMap.put(nameID, this);
    }


    public AbstractUItemData(String legacyName, String nameID) {
        this.material = UMaterial.matchMaterial(nameID, legacyName);
        this.modernNameID = nameID;
        this.legacyNameID = legacyName;
        this.legacyDataShort = (byte) 0;

        itemDataMap.put(nameID, this);
    }

    public AbstractUItemData(LegacyCompactedData legacyCompactedData, String nameID) {
        this.material = UMaterial.matchMaterial(nameID, legacyCompactedData.getName());
        this.modernNameID = nameID;
        this.legacyDataShort = legacyCompactedData.getData();
        this.legacyNameID = legacyCompactedData.getName();

        itemDataMap.put(nameID, this);
    }
    protected ItemStack toItemStack() {
        System.out.println(material);
        System.out.println(NMSVersionUtil.getType());
        if(NMSVersionUtil.isLegacy())
            return toLegacyItemStack(1, legacyDataShort);
        return new ItemStack(material,1);
    }


    public String getCurrentNameID() {
        return NMSVersionUtil.isLegacy() ? legacyNameID : modernNameID;
    }
    protected ItemStack toItemStack(int amount) {
        if(NMSVersionUtil.isLegacy())
            return toLegacyItemStack(amount, legacyDataShort);
        return new ItemStack(material,amount);
    }
    private ItemStack toLegacyItemStack(int amount, short data) {
        try {
            System.out.println(material);
            return getItemStackMethod(Material.class, int.class, short.class).newInstance(material, amount, data);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private Constructor<ItemStack> getItemStackMethod(Class<?>... parameterTypes) {
        try {
            return ItemStack.class.getConstructor(parameterTypes);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @Getter
    public static class LegacyCompactedData{
        private final String name;
        private final byte data;

        public LegacyCompactedData(String name, byte data){
            this.name = name;
            this.data = data;
        }
    }



    public interface ItemDataToMat {
        Material toMaterial(AbstractUItemData itemData);
    }
    public interface ItemDataToItemStack {
        ItemStack toItemStack();
        ItemStack toItemStack(int amount);
    }

}
