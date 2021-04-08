package net.lostfables.startuploader;

import net.lostfables.startuploadercommon.StartupLoader;
import org.bukkit.plugin.java.JavaPlugin;

public final class StartupLoaderSpigot extends JavaPlugin {

	static {
		StartupLoader.Start();
	}

}
