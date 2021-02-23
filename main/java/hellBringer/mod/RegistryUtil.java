package hellBringer.mod;

import hellBringer.HBSword;
import hellBringer.item.hbsword;
import hellBringer.materials.ModMaterials;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RegistryUtil {

	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(HBSword.MODID, name).setUnlocalizedName(HBSword.MODID + "." + name);
		return item;
	}
	
	final Item[] items = {
			RegistryUtil.setItemName(new Item(), "hbingot").setCreativeTab(CreativeTabs.MATERIALS),
			RegistryUtil.setItemName(new hbsword(ModMaterials.HELLBRINGER_SWORD), "hbsword").setCreativeTab(CreativeTabs.COMBAT)
	};
	
	public static Block setBlockName(final Block block, final String name) {
		block.setRegistryName(HBSword.MODID, name).setUnlocalizedName(HBSword.MODID + "." + name);
		return block;
	}
}
