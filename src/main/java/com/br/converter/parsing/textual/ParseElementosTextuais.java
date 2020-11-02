package com.br.converter.parsing.textual;

import java.io.File;

import com.br.converter.parsing.ParseElementos;
import com.br.converter.util.ConverterFileUtil;
import com.br.models.Capitulo;

public class ParseElementosTextuais extends ParseElementos {
	
	/**
	 * Persiste os dados do capítulo em um arquivo.
	 * @param file
	 * @param document
	 * @return void
	 */
	public void parse(File file, Capitulo capitulo) {
		String chapContent = persistCapitulo(capitulo);
		ConverterFileUtil.writeFile(file, chapContent);
	}

}
