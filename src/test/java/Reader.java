import net.minecraft.server.v1_8_R3.Items;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class Reader {
    Map<String, ItemTest> blocksInit = new HashMap<>();
    Map<String, ItemTest> itemsInit = new HashMap<>();
    Map<String, ItemTest> blocksCompare = new HashMap<>();
    Map<String, ItemTest> itemsCompare = new HashMap<>();
    public static void main(String[] args) {
        // get file in ressources
        Reader reader = new Reader();
        reader.readLine("blocks1_8.txt",reader.blocksInit);
        reader.readLine("items1_8.txt",reader.itemsInit);
        reader.readLine("blocks1_13.txt",reader.blocksCompare);
        reader.readLine("items1_13.txt",reader.itemsCompare);

        StringBuilder builder = reader.compare(true);
        System.out.println(builder.toString());
        reader.writeInFile("blocks.txt",builder.toString());
    }

    public void readLine(String file, Map<String, ItemTest> blocks) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(Reader.class.getResourceAsStream("/"+file)));

        StringBuffer buffer = new StringBuffer();
        try {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                if(line.contains("get(")){
                    while (line.charAt(0) == ' '){
                        line = line.substring(1);
                    }
                    i++;
                    String enumBlock = line.split(" ")[0];
                    String name = line.split("get\\(")[1].split("\\)")[0];
                  //  name = name.substring(1,name.length()-1);
                    System.out.println(i+"Block."+enumBlock+".getName() -> "+name);

                    blocks.put(enumBlock,new ItemTest(name,enumBlock));
                   // buffer.append("public static final String "+enumBlock+" = new UItemData("
                }
            }
            System.out.println("Total: "+i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public StringBuilder compare(boolean staticField) {
        StringBuilder builder = new StringBuilder();
        for (String s : blocksInit.keySet()) {
            ItemTest blockTest1 = blocksInit.get(s);
            ItemTest blockTest2 = blocksCompare.get(s);
            if(blockTest1!= null && blockTest2 != null){
                if(staticField){
                    builder.append("public static final UItemData "+blockTest1.getEnumName()+" = new UItemData("+blockTest1.getName()+","+blockTest2.getName()+");\n");
                }else {
                    builder.append("public final UItemData "+blockTest1.getEnumName()+" = new UItemData("+blockTest1.getName()+","+blockTest2.getName()+");\n");
                }
            }
        }

        builder.append("\n // Block not found in legacy -> 1.13\n");
        for (String s : blocksCompare.keySet()) {
            ItemTest blockTest1 = blocksInit.get(s);
            ItemTest blockTest2 = blocksCompare.get(s);
            if(blockTest1 == null && blockTest2 != null){
                if(staticField){
                    builder.append("public static final UItemData "+blockTest2.getEnumName()+" = new UItemData("+blockTest2.getName()+","+blockTest2.getName()+");\n");
                }else {
                    builder.append("public final UItemData "+blockTest2.getEnumName()+" = new UItemData("+blockTest2.getName()+","+blockTest2.getName()+");\n");
                }
            }
        }

        builder.append("\n // Block not found in 1.13 -> LEGACY\n");
        for (String s : blocksInit.keySet()) {
            ItemTest blockTest1 = blocksInit.get(s);
            ItemTest blockTest2 = blocksCompare.get(s);
            if(blockTest1 != null && blockTest2 == null){
                if(staticField){
                    builder.append("public static final UItemData "+blockTest1.getEnumName()+" = new UItemData("+blockTest1.getName()+","+blockTest1.getName()+");\n");
                }else {
                    builder.append("public final UItemData "+blockTest1.getEnumName()+" = new UItemData("+blockTest1.getName()+","+blockTest1.getName()+");\n");
                }
            }
        }

        builder.append("\n // Items\n");
        for (String s : itemsInit.keySet()) {
            ItemTest itemTest1 = itemsInit.get(s);
            ItemTest itemTest2 = itemsCompare.get(s);
            if(itemTest1!= null && itemTest2 != null){
                if(staticField){
                    builder.append("public static final UItemData "+itemTest1.getEnumName()+" = new UItemData("+itemTest1.getName()+","+itemTest2.getName()+");\n");
                }else {
                    builder.append("public final UItemData "+itemTest1.getEnumName()+" = new UItemData("+itemTest1.getName()+","+itemTest2.getName()+");\n");
                }
            }
        }

        builder.append("\n // Items not found in legacy -> 1.13\n");
        for (String s : itemsCompare.keySet()) {
            ItemTest itemTest1 = itemsInit.get(s);
            ItemTest itemTest2 = itemsCompare.get(s);
            if(itemTest1 == null && itemTest2 != null){
                if(staticField){
                    builder.append("public static final UItemData "+itemTest2.getEnumName()+" = new UItemData("+itemTest2.getName()+","+itemTest2.getName()+");\n");
                }else {
                    builder.append("public final UItemData "+itemTest2.getEnumName()+" = new UItemData("+itemTest2.getName()+","+itemTest2.getName()+");\n");
                }
            }
        }

        builder.append("\n // Items not found in 1.13 -> LEGACY\n");
        for (String s : itemsInit.keySet()) {
            ItemTest itemTest1 = itemsInit.get(s);
            ItemTest itemTest2 = itemsCompare.get(s);
            if(itemTest1 != null && itemTest2 == null){
                if(staticField){
                    builder.append("public static final UItemData "+itemTest1.getEnumName()+" = new UItemData("+itemTest1.getName()+","+itemTest1.getName()+");\n");
                }else {
                    builder.append("public final UItemData "+itemTest1.getEnumName()+" = new UItemData("+itemTest1.getName()+","+itemTest1.getName()+");\n");
                }
            }
        }

        return builder;
    }

    public void writeInFile(String file, String content) {

        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(new File(file).toPath())));
            writer.write(content);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
