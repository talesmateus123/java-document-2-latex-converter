package com.br.components.parsing.textual;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.br.components.parsing.ParseElementosComponent;
import com.br.models.Capitulo;
import com.br.util.FileUtil;

@Component
public final class ParseElementosTextuaisComponent extends ParseElementosComponent {
	
	/**
	 * Persiste os dados do capítulo em um arquivo.
	 * @param file
	 * @param document
	 * @return void
	 * @throws IOException 
	 */
	public void parse(File file, Capitulo capitulo) throws IOException {
		String chapContent = persistCapitulo(capitulo);
		FileUtil.writeFile(file, chapContent);
	}

}
