package be.alexandre01.universal.material;

public class UMinecraftKey {
    private final String namespace;
    private final String key;

    public UMinecraftKey(String namespace, String key) {
        this.namespace = namespace;
        this.key = key;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        return this.namespace + ":" + this.key;
    }

    public static UMinecraftKey of(String s) {
        int i = s.indexOf(58);
        if (i < 0) {
            return new UMinecraftKey("minecraft", s);
        } else {
            return new UMinecraftKey(s.substring(0, i), s.substring(i + 1));
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof UMinecraftKey)) {
            return false;
        } else {
            UMinecraftKey that = (UMinecraftKey)o;
            if (this.namespace != null) {
                if (!this.namespace.equals(that.namespace)) {
                    return false;
                }
            } else if (that.namespace != null) {
                return false;
            }

            return this.key != null ? this.key.equals(that.key) : that.key == null;
        }
    }

    public int hashCode() {
        int result = this.namespace != null ? this.namespace.hashCode() : 0;
        result = 31 * result + (this.key != null ? this.key.hashCode() : 0);
        return result;
    }
}
