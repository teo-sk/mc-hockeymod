package net.minecraft.src;

public class mod_Hockey extends BaseMod {

	public static final Block shit = new BlockShit(200,0).setBlockName("shit");
	
	public static final Item hockeyStick = new Item(2000).setItemName("hockeyStick");
	public static final Item puck = new Item(2001).setItemName("puck");
	
	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "1.3.2";
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}
	
	public mod_Hockey()
	{
		ModLoader.registerBlock(shit);
		ModLoader.addName(shit, "Super-crazy-awesome-cool SHIT");
			    
		hockeyStick.iconIndex = ModLoader.addOverride("/gui/items.png", "/hockeymod/hockeyStick.png");
		puck.iconIndex = ModLoader.addOverride("/gui/items.png", "/hockeymod/puck.png");
		ModLoader.addName(hockeyStick, "Wooden Hockey Stick");
		ModLoader.addName(puck, "Hockey Puck");
		
		ModLoader.addRecipe(new ItemStack(hockeyStick, 1), new Object[] {"  #", " #X", "#  ", '#', Item.stick, 'X', Block.planks});

	}

}
