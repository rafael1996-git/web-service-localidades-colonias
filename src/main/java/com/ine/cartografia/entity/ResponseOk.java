package com.ine.cartografia.entity;

/**
 * Esta clase contiene generica en el proyecto que sirve para almacenar los mensaje de respuesta del web service
 * @author Alejandro Sandoval Rodriguez 
 * @version 1.3.2
 * 
 */
import java.util.List;

public class ResponseOk {

	/**
	 * atributos de la clase ResponseOK para settear la respuesta
	 * 
	 * @param estatus   estatus del mensaje de acuerdo a la lista
	 * @param resultado lista del resultado
	 * @param msj       mensaje de retorno del servicio
	 */
	private Integer estatus;
	private List<?> resultado;
	private String msj;

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public List<?> getResultado() {
		return resultado;
	}

	public void setResultado(List<?>  codigo) {
		this.resultado = codigo;
	}

	public String getMsj() {
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}

}
