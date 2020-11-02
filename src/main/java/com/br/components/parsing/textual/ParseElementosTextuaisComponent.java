package com.br.components.parsing.textual;

import java.io.File;

import org.springframework.stereotype.Component;

import com.br.components.parsing.ParseElementosComponent;
import com.br.models.Capitulo;
import com.br.util.ConverterFileUtil;

@Component
public final class ParseElementosTextuaisComponent extends ParseElementosComponent {
	
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
