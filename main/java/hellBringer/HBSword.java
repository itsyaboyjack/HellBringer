package hellBringer;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = HBSword.MODID, name = HBSword.NAME, version = HBSword.VERSION, acceptedMinecraftVersions = HBSword.MC_VERSION)
public class HBSword {
	public static final String MODID = "hellbringer";
	public static final String NAME = "Hell Bringer";
	public static final String VERSION = "1.0";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final Logger LOGGER = LogManager.getLogger(HBSword.MODID);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(HBSword.NAME + " says hi");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
