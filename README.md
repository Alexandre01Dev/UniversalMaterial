## UniversalMaterial (0.0.1-alpha)
UniversalMaterial is a library that provide classes to work with Bukkit Materials and Minecraft versions. It's a simple library that can be used to make your plugin compatible with multiple versions of Minecraft.

## How to use
To use this library, you need to add it as a dependency in your maven or gradle project. 

To use the library, when you want to use a Material. You can call UMaterial class and you can find the Material you want to use. 

```java
UMaterial.GREEN_WOOL;
```
You can convert a Material to UMaterial by using the method `UMaterial.MYMATERIAL.toMaterial()`. 

```java
Material material = UMaterial.GREEN_WOOL.toMaterial();
```

You can convert to an ItemStack by using the method `UMaterial.MYMATERIAL.toItemStack()`. 

```java
ItemStack itemStack = UMaterial.GREEN_WOOL.toItemStack();
```

You can also check if a Material is equal to a UMaterial by using the method `UMaterial.MYMATERIAL.isMaterial(Material material) or UMaterial.isEquivalent(Material material, UMaterial uMaterial)`.

```java
import be.alexandre01.universal.material.UMaterial;

@EventHandler
public void onPlayerInteract(PlayerInteractEvent event) {
    if (UMaterial.GREEN_WOOL.isMaterial(event.getItem().getType())) {
        // Do something
    }
    // or
    if ( UMaterial.isEquivalent(event.getItem().getType(), UMaterial.ORANGE_BANNER)){
        // Do something
    }
}
```

You can also get the UMaterial from a Material by using the method `UMaterial.fromMaterial(Material material)`. 

```java
@EventHandler
public void onPlayerInteract(PlayerInteractEvent event) {
    UMaterial uMaterial = UMaterial.fromMaterial(event.getItem().getType());
}
```


## Remarks
This library is still in alpha-test, it is possible that not all materials are supported. If you find a material that is not supported, please create an issue on the GitHub page.




