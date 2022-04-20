package com.ine.cartografia.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ine.cartografia.entity.CodDto;


public class Codigo_Dto {
	private final Logger logger = LoggerFactory.getLogger(Codigo_Dto.class);

	public CodDto mapRow(ResultSet rs, int arg1) throws SQLException {
		CodDto opj = new CodDto();
		opj.setClaveEntidad(rs.getInt("clave_entidad"));
		opj.setNombreEntidad(rs.getString("nombre_entidad"));
		opj.setClaveMunicipio(rs.getInt("clave_municipio"));
		opj.setNombreMunicipio(rs.getString("nombre_municipio"));
		opj.setClaveLocalidad(rs.getInt("clave_localidad"));
		opj.setTipoLocalidad(rs.getString("tipo_localidad"));
		opj.setClaveMColonia(rs.getInt("clave_municipio_colonia"));
		opj.setNombreColonia(rs.getString("nombre_colonia"));
		opj.setTipoGeo(rs.getString("tipo_geo"));
		opj.setControl(rs.getLong("control"));
		opj.setLocalidad(rs.getString("localidad"));
		opj.setClasificacion(rs.getLong("clasificacion"));
		opj.setCp(rs.getInt("cp"));
	
		
		logger.info("UserControl2mapper: "+opj.toString());
		return opj;
	}
}
