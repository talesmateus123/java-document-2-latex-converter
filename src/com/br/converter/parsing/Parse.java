package com.br.converter.parsing;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import com.br.converter.util.ConverterUtil;
import com.br.models.Documento;

public abstract class Parse {
	
	public void parse(File file, Documento document) {
		List<String> parts = null;
		String data = ConverterUtil.readFile(file);
		parts = ConverterUtil.splitData(data);
		
		parts = parts.stream().map(part -> {
			if (part.startsWith("/")) 
				return persistData(part, document);;
			return part;
		}).collect(Collectors.toList());
		
		String string = "";
		
		for(String part : parts)
			string += part;
		
		ConverterUtil.writeFile(file, string);
	}

	protected String persistData(String string, Documento document) {
		return string;
	}
	
}
