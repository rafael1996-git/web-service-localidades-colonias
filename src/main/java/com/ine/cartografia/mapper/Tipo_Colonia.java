package com.ine.cartografia.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ine.cartografia.entity.TipoColonia;

public class Tipo_Colonia {
	private final Logger logger = LoggerFactory.getLogger(Tipo_Colonia.class);

	public TipoColonia mapRow(ResultSet rs, int arg1) throws SQLException {
		TipoColonia opj = new TipoColonia();
		opj.setTipoColoniaId(rs.getInt("tipo_colonia_id"));
		opj.setDescripcion(rs.getString("descripcion"));
		opj.setDescripcionCorta(rs.getString("descripcion_corta"));
		
	
		
		logger.info("TipoColoniaMapper: "+opj.toString());
		return opj;
	}
}
