package com.br.util;

import java.io.File;

public class FilePdfUtil {

    /**
     * This method zips the directory
     * @param dir
     */
    public static File pdfDirectory(File dir) {
    	File zippedFile = new File(dir.getPath() + ".zip");
        return zippedFile;
    }
	
}
