package net.lostfables.startuploadercommon;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class StartupLoader extends URLClassLoader {

	private static boolean started = false;

	public static void Start() {
		if (!started) {
			started = true;
			File rootFolder = new File("StartupLoader/jars"); // Root Directory for StartupLoader.
			if (rootFolder.exists() || rootFolder.mkdirs()) { // If the directory exists or we have successfully made the directory...
				File[] jars = rootFolder.listFiles(); // List all the files within the directory
				if (jars != null && jars.length > 0) { // If we got a list and it's > 0 in size, we iterate through it.

					URL[] urls = new URL[jars.length];
					for (int i = 0; i < jars.length; i++) {
						try {
							urls[i] = jars[i].toURI().toURL();
							System.out.println("[StartupLoader] Loading " + jars[i].getName() + "...");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}

					new StartupLoader(urls);
					System.out.println("[StartupLoader] Loading complete.");
				}
			}
		}
	}

	private StartupLoader(URL[] urls) {
		super(urls);
	}

}
