package be.alexandre01.universal.material;

import org.bukkit.Bukkit;

public class NMSVersionUtil {
    private static final String VERSION;
    private static final ReflectionType type;

    static {
        String name = Bukkit.getServer().getClass().getPackage().getName();
        VERSION = name.substring(name.lastIndexOf(46) + 1);
        ReflectionType reflectionType;
        try {
            String[] split = VERSION.split("_");
            int first = Integer.parseInt(split[0]);
            reflectionType = ReflectionType.valueOf("V" + first + "_" + split[1]);
        } catch (IllegalArgumentException e) {
            reflectionType = ReflectionType.UNKNOWN;
        }
        type = reflectionType;
    }

    public static boolean isLegacy() {
        return type.isLegacy();
    }

    public static ReflectionType getType() {
        return type;
    }

    public enum ReflectionType {
        LEGACY(true),
        V1_8(true),
        V1_9(true),
        V1_10(true),
        V1_11(true),
        V1_12(true),
        V1_13,
        V1_14,
        V1_15,
        V1_16,
        V1_17,
        V1_18,
        V1_19,
        V1_20,
        UNKNOWN;

        final boolean isLegacy;
        ReflectionType( boolean isLegacy) {
            this.isLegacy = isLegacy;
        }
        ReflectionType() {
            this.isLegacy = false;
        }

        public boolean isLegacy() {
            return isLegacy;
        }
    }
}
