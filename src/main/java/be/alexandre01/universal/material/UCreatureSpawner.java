package be.alexandre01.universal.material;

public class UCreatureSpawner extends UItemData{

    public UCreatureSpawner(String legacyName, String nameID) {
        super(legacyName, nameID);
    }

    public UCreatureSpawner(LegacyCompactedData legacyCompactedData, String nameID) {
        super(legacyCompactedData, nameID);
    }
    //TODO : If the mc server is legacy, we need to register the spawner and when the user place it, we need to set the entity type
}
