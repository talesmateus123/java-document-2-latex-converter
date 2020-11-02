package com.br.components.parsing;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import com.br.models.Documento;
import com.br.util.FileUtil;

public abstract class Parse {
	
	/**
	 * Persiste os dados do documento em um arquivo.
	 * @param file
	 * @param document
	 * @return void
	 */
	public void parse(File file, Documento document) {
		List<String> splitedData = FileUtil.splitData(FileUtil.readFile(file));
		
		splitedData = splitedData.stream().map(part -> persistData(part, document))
				.collect(Collectors.toList());
		
		FileUtil.writeFile(file, splitListStringToString(splitedData));
	}

	/**
	 * Persiste os dados do documento em uma string.
	 * @param string
	 * @param document
	 * @return string
	 */
	protected String persistData(String string, Documento document) {
		return string;
	}
	
	/**
	 * Converte uma lista de strings separadas para uma simples string. 
	 * @param splitedStrings
	 * @return string
	 */
	protected String splitListStringToString(List<String> splitedStrings) {
		String string = new String();
		for(String part : splitedStrings)
			string += part;
		return string;
	}
	
}
