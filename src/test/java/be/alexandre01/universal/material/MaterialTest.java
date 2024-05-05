package be.alexandre01.universal.material;

import be.alexandre01.universal.material.UMaterial;
import net.minecraft.server.v1_8_R3.*;
import org.bukkit.Material;

import java.lang.reflect.Field;

public class MaterialTest {

    public static void main(String[] args) {
        System.out.println(Blocks.AIR.getName());

        if(UMaterial.isEquivalent(Material.AIR, UMaterial.AIR)){
            System.out.println("They are equivalent");
        }
        Class<?> clazz = Blocks.class;
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            try {

                Object obj = field.get(null);
                if(obj instanceof Block){
                    Block block = (Block) obj;
                    System.out.println(field.getName() + " -> " + block.getName());
                }
                if (obj instanceof Item) {
                    Item item = (Item) obj;
                    System.out.println("Item-> "+ field.getName() + " -> " + item.getName());
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
