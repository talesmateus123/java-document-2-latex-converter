package com.br.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilePdfUtil {
	
	private static Logger logger = LoggerFactory.getLogger(FilePdfUtil.class);

    /**
     * This method zips the directory
     * @param dir
     * @throws IOException 
     */
    public static File pdfDirectory(File dir) throws IOException {
        return runCommand(dir);
    }
    
    private static File runCommand(File dir) {
    	File pdfFile = null;
    	ProcessBuilder processBuilder = new ProcessBuilder();
    	
    	processBuilder.command("bash", "-c", "cd " + dir.getPath() + " && pdflatex main.tex && bibtex main.aux && pdflatex main.tex && pdflatex main.tex");
        
        try {
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
            	logger.info(line);
            }
            int exitVal = process.waitFor();
            
            if (exitVal == 0) {
            	logger.info("PDF file generated successfuly");
                pdfFile = new File(dir.getPath()+ "/main.pdf");
            } 
            else {
    	        logger.error("Error during generate PDF file");
            }

        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pdfFile;
    }
	
}
