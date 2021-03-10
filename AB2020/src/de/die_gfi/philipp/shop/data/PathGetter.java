package de.die_gfi.philipp.shop.data;

import java.net.URL;
import java.nio.file.Path;

public class PathGetter {
    /**
     * Just gets the path for the data folder
     *
     * @return Path of PathGetter class to make paths everywhere easier.
     */
    public static String getDataPath() {
        String className = PathGetter.class.getName().replace(".", "/")+".class";
        URL classUrl  = PathGetter.class.getClassLoader().getResource(className);
        String fullPath = classUrl==null ? null : classUrl.getPath();
        fullPath = fullPath != null ? fullPath.substring(0, fullPath.length() - "PathGetter.class".length()) : null;
        if (fullPath != null) {
            if (fullPath.contains("bin") || fullPath.contains("out")) {
                fullPath = fullPath.replaceAll("out/production/ab2020|bin", "src");
            }
            if (System.getProperty("os.name").startsWith("Windows")) {
                fullPath = fullPath.substring(1).replace('/', '\\');
            }
        }
        return fullPath;
    }
}
