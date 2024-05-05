package be.alexandre01.universal.material.modern;

import be.alexandre01.universal.material.AbstractUItemData;

public class UModernItemData extends AbstractUItemData {

    public UModernItemData(AbstractUItemData replacement, String nameID) {
        super(replacement, nameID);
    }

    public UModernItemData(String legacyName, String nameID) {
        super(legacyName, nameID);
    }

    public UModernItemData(LegacyCompactedData legacyCompactedData, String nameID) {
        super(legacyCompactedData, nameID);
    }
}
