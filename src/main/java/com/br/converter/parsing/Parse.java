package com.br.converter.parsing;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import com.br.converter.util.ConverterUtil;
import com.br.models.Documento;

public abstract class Parse {
	
	/**
	 * Persiste os dados do documento em um arquivo.
	 * @param file
	 * @param document
	 * @return void
	 */
	public void parse(File file, Documento document) {
		List<String> splitedData = ConverterUtil.splitData(ConverterUtil.readFile(file));
		
		splitedData = splitedData.stream().map(part -> persistData(part, document))
				.collect(Collectors.toList());
		
		ConverterUtil.writeFile(file, splitListStringToString(splitedData));
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
