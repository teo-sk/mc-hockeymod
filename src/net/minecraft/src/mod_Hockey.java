package net.minecraft.src;

public class mod_Hockey extends BaseMod {
	
	public static final Item woodenHockeyStick = new Item(2000).setItemName("woodenHockeyStick");
	public static final Item ironHockeyStick = new Item(2001).setItemName("ironHockeyStick");
	public static final Item diamondHockeyStick = new Item(2002).setItemName("diamondHockeyStick");
	public static final Item puck = new Item(2003).setItemName("puck");
	
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
		woodenHockeyStick.iconIndex = ModLoader.addOverride("/gui/items.png", "/hockeymod/woodenHockeyStick.png");
		ironHockeyStick.iconIndex = ModLoader.addOverride("/gui/items.png", "/hockeymod/ironHockeyStick.png");
		diamondHockeyStick.iconIndex = ModLoader.addOverride("/gui/items.png", "/hockeymod/diamondHockeyStick.png");
		puck.iconIndex = ModLoader.addOverride("/gui/items.png", "/hockeymod/puck.png");
		ModLoader.addName(woodenHockeyStick, "Wooden Hockey Stick");
		ModLoader.addName(ironHockeyStick, "Iron Hockey Stick");
		ModLoader.addName(diamondHockeyStick, "Diamond Hockey Stick");
		ModLoader.addName(puck, "Hockey Puck");
		
		ModLoader.addRecipe(new ItemStack(woodenHockeyStick, 1), new Object[] {"  #", " #X", "#  ", '#', Item.stick, 'X', Block.planks});
		ModLoader.addRecipe(new ItemStack(ironHockeyStick, 1), new Object[] {"  X", " XX", "X  ", 'X', Item.ingotIron});
		ModLoader.addRecipe(new ItemStack(diamondHockeyStick, 1), new Object[] {"  X", " XX", "X  ", 'X', Item.diamond});
		ModLoader.addRecipe(new ItemStack(puck, 10), new Object[] {" # ", "#X#", " # ", '#', Item.slimeBall, 'X', Block.obsidian});
	}

}
