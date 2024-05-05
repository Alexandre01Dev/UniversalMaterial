package be.alexandre01.universal.material;

import org.bukkit.inventory.ItemStack;

public class USpecificItemData extends AbstractUItemData implements AbstractUItemData.ItemDataToItemStack{
    public USpecificItemData(AbstractUItemData replacement, String nameID) {
        super(replacement, nameID);
    }

    public USpecificItemData(String legacyName, String nameID) {
        super(legacyName, nameID);
    }

    public USpecificItemData(LegacyCompactedData legacyCompactedData, String nameID) {
        super(legacyCompactedData, nameID);
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
