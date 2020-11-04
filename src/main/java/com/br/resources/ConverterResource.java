package com.br.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.dto.DocumentoNewDTO;
import com.br.models.Documento;
import com.br.services.ConverterService;

@RestController
@RequestMapping(value = "/api/converter")
public class ConverterResource {
	@Autowired
	private ConverterService service;
	
	@PostMapping
	public ResponseEntity<Resource> defaultConvertMethod(@Valid @RequestBody DocumentoNewDTO objectDTO) {
		return convertDocumentoToZipFile(objectDTO);
	}
	
	@PostMapping("/zip")
	public ResponseEntity<Resource> convertDocumentoToZipFile(@Valid @RequestBody DocumentoNewDTO objectDTO) {
		Documento object = this.service.fromDTO(objectDTO);		
		Resource resource = this.service.convertToZipFile(object);
		
		return ResponseEntity.ok()
	            .contentType(MediaType.APPLICATION_OCTET_STREAM)
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}
	
	@PostMapping("/pdf")
	public ResponseEntity<Resource> convertDocumentoToPdfFile(@Valid @RequestBody DocumentoNewDTO objectDTO) {
		Documento object = this.service.fromDTO(objectDTO);		
		Resource resource = this.service.convertToPdfFile(object);
		
		return ResponseEntity.ok()
	            .contentType(MediaType.APPLICATION_PDF)
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}
	
}
