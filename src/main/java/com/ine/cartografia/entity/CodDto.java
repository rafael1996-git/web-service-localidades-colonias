package com.ine.cartografia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CodDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@JsonIgnore
	private Integer claveEntidad;
	@JsonIgnore
	private String nombreEntidad;
	@JsonIgnore
	private Integer claveMunicipio;
	@JsonIgnore
	private String nombreMunicipio;
	@JsonIgnore
	private Integer claveLocalidad;
	@JsonIgnore
	private String tipoLocalidad;

	@JsonIgnore
	private Integer ClaveMColonia;
	
	private String nombreColonia;
	@JsonIgnore
	private String tipoGeo;
	@JsonIgnore
	private Long control;
	@JsonIgnore
	private String localidad;

	
	private Long clasificacion;
	
	private Integer cp;

	private TipoColonia DetalleDescripcion;

	public CodDto() {

	}


	public CodDto(Integer claveEntidad, String nombreEntidad, Integer claveMunicipio, String nombreMunicipio,
			Integer claveLocalidad, String tipoLocalidad, Integer claveMColonia, String nombreColonia, String tipoGeo,
			Long control, String localidad, Long clasificacion, Integer cp, TipoColonia detalleDescripcion) {
		this.claveEntidad = claveEntidad;
		this.nombreEntidad = nombreEntidad;
		this.claveMunicipio = claveMunicipio;
		this.nombreMunicipio = nombreMunicipio;
		this.claveLocalidad = claveLocalidad;
		this.tipoLocalidad = tipoLocalidad;
		ClaveMColonia = claveMColonia;
		this.nombreColonia = nombreColonia;
		this.tipoGeo = tipoGeo;
		this.control = control;
		this.localidad = localidad;
		this.clasificacion = clasificacion;
		this.cp = cp;
		DetalleDescripcion = detalleDescripcion;
	}


	public Integer getClaveEntidad() {
		return claveEntidad;
	}

	public void setClaveEntidad(Integer claveEntidad) {
		this.claveEntidad = claveEntidad;
	}

	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	public Integer getClaveMunicipio() {
		return claveMunicipio;
	}

	public void setClaveMunicipio(Integer claveMunicipio) {
		this.claveMunicipio = claveMunicipio;
	}

	public String getNombreMunicipio() {
		return nombreMunicipio;
	}

	public void setNombreMunicipio(String nombreMunicipio) {
		this.nombreMunicipio = nombreMunicipio;
	}

	public Integer getClaveLocalidad() {
		return claveLocalidad;
	}

	public void setClaveLocalidad(Integer claveLocalidad) {
		this.claveLocalidad = claveLocalidad;
	}

	public String getTipoLocalidad() {
		return tipoLocalidad;
	}

	public void setTipoLocalidad(String tipoLocalidad) {
		this.tipoLocalidad = tipoLocalidad;
	}

	@JsonIgnore
	public Integer getClaveMColonia() {
		return ClaveMColonia;
	}

	public void setClaveMColonia(Integer claveMColonia) {
		ClaveMColonia = claveMColonia;
	}

	public String getNombreColonia() {
		return nombreColonia;
	}

	public void setNombreColonia(String nombreColonia) {
		this.nombreColonia = nombreColonia;
	}

	public String getTipoGeo() {
		return tipoGeo;
	}

	public void setTipoGeo(String tipoGeo) {
		this.tipoGeo = tipoGeo;
	}

	public Long getControl() {
		return control;
	}

	public void setControl(Long control) {
		this.control = control;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Long getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Long clasificacion) {
		this.clasificacion = clasificacion;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TipoColonia getDetalleDescripcion() {
		return DetalleDescripcion;
	}

	public void setDetalleDescripcion(TipoColonia detalleDescripcion) {
		DetalleDescripcion = detalleDescripcion;
	}

	
	

}
