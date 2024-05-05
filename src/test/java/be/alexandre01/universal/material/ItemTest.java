package be.alexandre01.universal.material;

public class ItemTest {
    private final String name;
    private final String enumName;

    public ItemTest(String name, String enumName) {
        this.name = name;
        this.enumName = enumName;
    }

    public String getName() {
        return name;
    }

    public String getEnumName() {
        return enumName;
    }
}
