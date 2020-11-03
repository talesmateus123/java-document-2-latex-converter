package com.br.components.parsing.pos_textual;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.br.components.parsing.ParseElementosComponent;
import com.br.models.Capitulo;
import com.br.util.FileUtil;

@Component
public final class ParseElementosPosTextuaisComponent extends ParseElementosComponent {
	
	/**
	 * Persiste os dados do capítulo em um arquivo.
	 * @param file
	 * @param document
	 * @return void
	 * @throws IOException 
	 */
	public void parse(File file, List<Capitulo> capitulos) throws IOException {
		List<String> splitedData = FileUtil.splitData(FileUtil.readFile(file));
		
		splitedData = splitedData.stream().map(part -> persistCapitulos(part, capitulos))
				.collect(Collectors.toList());

		FileUtil.writeFile(file, splitListStringToString(splitedData));
	}
	
	/**
	 * 
	 * @param string
	 * @param capitulo
	 * @return string
	 */
	private String persistCapitulos(String string, List<Capitulo> capitulos) {
		if (string.equals("\\apendices") || string.equals("\\anexos")) {
				return capitulos.stream().map(capitulo -> persistCapitulo(capitulo)).collect(Collectors.joining());
		}
		return string; 
	}

}
