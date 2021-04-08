package net.lostfables.startuploader;

import net.lostfables.startuploadercommon.StartupLoader;
import net.md_5.bungee.api.plugin.Plugin;

public final class StartupLoaderBungee extends Plugin {

	static {
		StartupLoader.Start();
	}

}
