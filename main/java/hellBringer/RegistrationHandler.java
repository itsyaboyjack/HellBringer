package hellBringer;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = HBSword.MODID)
public class RegistrationHandler {
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new Item().setRegistryName(HBSword.MODID, "hbingot").setUnlocalizedName(HBSword.MODID + "." + "hbingot").setCreativeTab(CreativeTabs.COMBAT),
				new Item().setRegistryName(HBSword.MODID, "hbsword").setUnlocalizedName(HBSword.MODID + "." + "hbsword").setCreativeTab(CreativeTabs.COMBAT)
		};
		
		event.getRegistry().registerAll(items);
		}
	}
	
