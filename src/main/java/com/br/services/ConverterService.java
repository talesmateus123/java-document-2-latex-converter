package com.br.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.br.components.converter.ConverterComponent;
import com.br.dto.DocumentoNewDTO;
import com.br.models.Documento;

@Service
public class ConverterService {
	@Autowired
	private ConverterComponent converterComponent;
	
	public Resource convertToZipFile(Documento documento) throws IOException {
		return converterComponent.convert(documento);
	}
	
	public Resource convertToPdfFile(Documento documento) throws IOException {
		return converterComponent.convert(documento, true);
	}
	
	private Documento fromDTO(DocumentoNewDTO documentoNewDTO) {
		Documento documento = new Documento();
		
		return documento;
	}
	
}
