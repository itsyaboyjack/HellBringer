package hellBringer.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class hbsword extends ItemSword{

	public hbsword(ToolMaterial material) {
		super(material);
		this.setRegistryName("hbsword");
		this.setUnlocalizedName("hbsword");
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	}


