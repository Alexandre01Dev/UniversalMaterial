package be.alexandre01.universal.material;

import lombok.Getter;
import org.bukkit.Bukkit;

public class NMSVersionUtil {
    private static final String VERSION;
    private static final ReflectionType type;

    static {
        String name = Bukkit.getServer().getClass().getPackage().getName();
        System.out.println(name);
        VERSION = name.substring(name.lastIndexOf(46) + 2);
        System.out.println(VERSION);
        ReflectionType reflectionType;
        try {
            String[] split = VERSION.split("_");
            reflectionType = ReflectionType.valueOf("V" + split[0] + "_" + split[1]);
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

    public static String getNMSPath() {
        //if(isLegacy())
            return "net.minecraft.server.v" + VERSION;
        //return "net.minecraft.server";
    }
    public static String getNMSPath(String path) {
        if(getType() == ReflectionType.V1_19 || getType() == ReflectionType.V1_20){
            return "net.minecraft." + path;
        }
        return getNMSPath() + "." + path;
    }
    public static String getNMSPath(String path,String after1_19) {
        if(getType() == ReflectionType.V1_19 || getType() == ReflectionType.V1_20){
            return "net.minecraft." + after1_19;
        }
        return getNMSPath() + "." + path;
    }

    public static String getBukkitPath() {
        return "org.bukkit.craftbukkit.v" + VERSION;
    }

    public static String getBukkitPath(String path) {
        return getBukkitPath() + "." + path;
    }

    public static Class<?> getBukkitClass(String path) throws ClassNotFoundException {
        return Class.forName(getBukkitPath(path));
    }


    public static Class<?> getNMSClass(String path) throws ClassNotFoundException {
        return Class.forName(getNMSPath(path));
    }

    public static Class<?> getNMSClass(String path, String after1_19) throws ClassNotFoundException {
        return Class.forName(getNMSPath(path, after1_19));
    }

    public enum ReflectionType {
        LEGACY(8,true),
        V1_8(8,true),
        V1_9(8,true),
        V1_10(10,true),
        V1_11(11,true),
        V1_12(12,true),
        V1_13(13),
        V1_14(14),
        V1_15(15),
        V1_16(16),
        V1_17(17),
        V1_18(18),
        V1_19(19),
        V1_20(20),
        UNKNOWN(V1_20.number);

        private final boolean isLegacy;
        @Getter
        private final int number;
        ReflectionType(int number, boolean isLegacy) {
            this.number = number;
            this.isLegacy = isLegacy;
        }
        ReflectionType(int number) {
            this.number = number;
            this.isLegacy = false;
        }

        public boolean isLegacy() {
            return isLegacy;
        }

        public boolean isAfter(ReflectionType type){
            return this.number > type.number;
        }

        public boolean isBefore(ReflectionType type){
            return this.number < type.number;
        }
    }
}
