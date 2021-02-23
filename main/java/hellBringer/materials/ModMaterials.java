package hellBringer.materials;

import hellBringer.HBSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {
	public static final ToolMaterial HELLBRINGER_SWORD = EnumHelper.addToolMaterial(HBSword.MODID + ":" + "Sword", 5, 5000, 10, 25, 18);

}
