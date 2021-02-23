package hellBringer.client;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import hellBringer.HBSword;
import hellBringer.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = HBSword.MODID)
public class ModelRegistrationHandler {

	@SubscribeEvent	
	public void registerModels(ModelRegistryEvent event) {
		
		registerModel(ModItems.HELLBRINGER_INGOT, 0);
		registerModel(ModItems.HELLBRINGER_SWORD, 0);
	}

	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
