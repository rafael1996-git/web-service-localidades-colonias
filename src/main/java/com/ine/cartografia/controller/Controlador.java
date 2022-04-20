package com.ine.cartografia.controller;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ine.cartografia.entity.CodDto;
import com.ine.cartografia.entity.ResponseOk;
import com.ine.cartografia.service.IDaoReposiory;

@RestController()
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class Controlador {

	@Autowired
	private IDaoReposiory repository;

	/**
	 * Metodo que brinda el servicio de la consulta de Colonias con parametros clave_entidad,clave_municipio,clave_localidad y cp, tipo GET
	 * http://localhost:8080/WebServiceColonias/ClaveE?ClaveEntidad=9
	 * 
	 * http://localhost:8080/WebServiceColonias/ClaveEM?ClaveEntidad=9&ClaveMunicipio=12
	 * 
	 * http://localhost:8080/WebServiceColonias/ClaveEML?ClaveEntidad=9&ClaveMunicipio=12&ClaveLocalidad=11
	 * 
	 * http://localhost:8080/WebServiceColonias/ClaveEMCp?ClaveEntidad=9&ClaveMunicipio=12&Cp=14400
	 * 
	 * 
	 * @param clave_entidad 
	 * @param clave_municipio 
	 * @param clave_localidad 
	 * @param cp 
	 * @return retorna la lista 
	 * @throws Exception si no logra obtener la conexion
	 */
	
	
	
	
	
	@GetMapping(value = "/ClaveE")
	public ResponseOk getEntidad(@RequestParam(required = false) Integer ClaveEntidad) throws Exception {

		ResponseOk reponse = new ResponseOk();

		
		try {

			List<CodDto> resultado = repository.get(ClaveEntidad);

			if (resultado != null) {
				if (resultado.isEmpty()) {

					reponse.setEstatus(02);
					reponse.setResultado(resultado);
					reponse.setMsj("Operacion Exitosa: no se encontro registro");

				} else {


					reponse.setEstatus(04);
					reponse.setResultado(resultado);
					reponse.setMsj("Operacion Exitosa");

				}

			} else {
				reponse.setEstatus(01);
				reponse.setMsj(Response.serverError().toString());

			}
			return reponse;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, " not found");
		}
	}
	@GetMapping(value = "/ClaveEM")
	public ResponseOk getEntidadMunicipio(@RequestParam(required = false) Integer ClaveEntidad,@RequestParam (required = false)Integer ClaveMunicipio) throws Exception {

		ResponseOk reponse = new ResponseOk();

		

		try {

			List<CodDto> resultado = repository.getEntMun(ClaveEntidad, ClaveMunicipio);


			if (resultado != null) {
				if (resultado.isEmpty()) {

					reponse.setEstatus(02);
					reponse.setResultado(resultado);
					reponse.setMsj("Operacion Exitosa: no se encontro registro");

				} else {


					reponse.setEstatus(04);
					reponse.setResultado(resultado);
					reponse.setMsj("Operacion Exitosa");

				}

			} else {
				reponse.setEstatus(01);
				reponse.setMsj(Response.serverError().toString());

			}
			return reponse;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, " not found");
		}
	}
	
	@GetMapping(value = "/ClaveEML")
	public ResponseOk getEntidadMunicipioLocalidad(@RequestParam(required = false) Integer ClaveEntidad,@RequestParam (required = false)Integer ClaveMunicipio,
			@RequestParam (required = false)Integer ClaveLocalidad) throws Exception {

		ResponseOk reponse = new ResponseOk();


		try {

			List<CodDto> resultado = repository.getEntMunLoc(ClaveEntidad, ClaveMunicipio, ClaveLocalidad);


			if (resultado != null) {
				if (resultado.isEmpty()) {

					reponse.setEstatus(02);
					reponse.setResultado(resultado);
					reponse.setMsj("Operacion Exitosa: no se encontro registro");

				} else {


					reponse.setEstatus(04);
					reponse.setResultado(resultado);
					reponse.setMsj("Operacion Exitosa");

				}

			} else {
				reponse.setEstatus(01);
				reponse.setMsj(Response.serverError().toString());

			}
			return reponse;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, " not found");
		}
	}
	
	@GetMapping(value = "/ClaveEMCp")
	public ResponseOk getEntidadMunicipioLocalidadCp(@RequestParam(required = false) Integer ClaveEntidad,@RequestParam (required = false)Integer ClaveMunicipio,
			@RequestParam (required = false)Integer Cp) throws Exception {

		ResponseOk reponse = new ResponseOk();


		try {

			List<CodDto> resultado = repository.getEntMunLocCp(ClaveEntidad, ClaveMunicipio, Cp);


			if (resultado != null) {
				if (resultado.isEmpty()) {

					reponse.setEstatus(02);
					reponse.setResultado(resultado);
					reponse.setMsj("Operacion Exitosa: no se encontro registro");

				} else {


					reponse.setEstatus(04);
					reponse.setResultado(resultado);
					reponse.setMsj("Operacion Exitosa");

				}

			} else {
				reponse.setEstatus(01);
				reponse.setMsj(Response.serverError().toString());

			}
			return reponse;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, " not found");
		}
	}
}
