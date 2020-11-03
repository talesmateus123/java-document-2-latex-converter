package com.br.util;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilePdfUtil {
	
	private static Logger logger = LoggerFactory.getLogger(FilePdfUtil.class);

    /**
     * This method zips the directory
     * @param dir
     * @throws IOException 
     */
    public static File pdfDirectory(File dir) throws IOException, InterruptedException{
        return runCommand(dir);
    }
    
    private static File runCommand(File dir)  throws IOException, InterruptedException {
    	ProcessBuilder processBuilder = new ProcessBuilder();
    	// TODO Handle exceptions from command
    	processBuilder.command("bash", "-c", "cd " + dir.getPath() + " && pdflatex main.tex && bibtex main.aux && pdflatex main.tex && pdflatex main.tex");
        
        Process process = processBuilder.start();
        
        logger.info("Compiling LaTeX template to PDF file...");
        int exitVal = process.waitFor();
        
        if (exitVal == 0) {
        	logger.info("PDF file generated successfuly");
            return new File(dir.getPath()+ "/main.pdf");
        } 
        else {
	        logger.error("Error during generate PDF file");
	        throw new InterruptedException("Error during generate PDF file");
        }

    }
	
}