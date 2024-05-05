package be.alexandre01.universal.material;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class UItemData extends AbstractUItemData implements AbstractUItemData.ItemDataToMat, AbstractUItemData.ItemDataToItemStack{
    public UItemData(AbstractUItemData replacement, String nameID) {
        super(replacement, nameID);
    }

    public UItemData(String legacyName, String nameID) {
        super(legacyName, nameID);
    }

    public UItemData(LegacyCompactedData legacyCompactedData, String nameID) {
        super(legacyCompactedData, nameID);
    }

    @Override
    public Material toMaterial(AbstractUItemData itemData) {
        return super.material;
    }

    @Override
    public ItemStack toItemStack() {
        return super.toItemStack();
    }

    @Override
    public ItemStack toItemStack(int amount) {
        return super.toItemStack(amount);
    }
}
