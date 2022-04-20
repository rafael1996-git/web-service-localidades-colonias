package com.ine.cartografia.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ine.cartografia.entity.CodDto;
import com.ine.cartografia.entity.TipoColonia;



@Repository
public class ServiceImpl implements IDaoReposiory{
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	
	
	@Override
	public List<CodDto> get(Integer entidad) {
		String sql = "Select distinct a.clasificacion,b.descripcion, a.nombre_colonia,lpad(CAST(a.cp AS TEXT), 5, '0') as cp\r\n"
				+ "from geoloc.codigo_dto as a join geoloc.tipo_colonia as b \r\n"
				+ "on a.clasificacion = b.tipo_colonia_id\r\n"
				+ "where a.clave_entidad = ?;";
        @SuppressWarnings("deprecation")
		List<CodDto> dato = this.jdbcTemplate.query(sql, new Object[]{entidad}, new RowMapper<CodDto>() {
            @Override
            public CodDto mapRow(ResultSet rs, int i) throws SQLException {
            	CodDto f = new CodDto();
            	TipoColonia col = new TipoColonia();

            	f.setClasificacion(rs.getLong("clasificacion"));
            	col.setDescripcion(rs.getString("descripcion"));
            	f.setNombreColonia(rs.getString("nombre_colonia"));
            	f.setCp(rs.getInt("cp"));
            	f.setDetalleDescripcion(col);
                return f;
            }
        });
        return dato;
    }



	@Override
	public List<CodDto> getEntMun(Integer entidad, Integer Municipio) {
		String sql ="Select distinct a.clasificacion,b.descripcion, a.nombre_colonia,lpad(CAST(a.cp AS TEXT), 5, '0') as cp\r\n"
				+ "from geoloc.codigo_dto as a join geoloc.tipo_colonia as b \r\n"
				+ "on a.clasificacion = b.tipo_colonia_id\r\n"
				+ "where a.clave_entidad = ? and a.clave_municipio = ?;";
		@SuppressWarnings("deprecation")
		List<CodDto> dato = this.jdbcTemplate.query(sql, new Object[]{entidad,Municipio}, new RowMapper<CodDto>() {
			
		
            @Override
            public CodDto mapRow(ResultSet rs, int i) throws SQLException {
            	CodDto f = new CodDto();
            	TipoColonia col = new TipoColonia();

            	f.setClasificacion(rs.getLong("clasificacion"));
            	col.setDescripcion(rs.getString("descripcion"));
            	f.setNombreColonia(rs.getString("nombre_colonia"));
            	f.setCp(rs.getInt("cp"));
            	f.setDetalleDescripcion(col);
                return f;
            }
        });
        return dato;
	}



	@Override
	public List<CodDto> getEntMunLoc(Integer entidad, Integer Municipio, Integer localidad) {
		String sql ="Select distinct a.clasificacion,b.descripcion, a.nombre_colonia,lpad(CAST(a.cp AS TEXT), 5, '0') as cp\r\n"
				+ "from geoloc.codigo_dto as a join geoloc.tipo_colonia as b \r\n"
				+ "on a.clasificacion = b.tipo_colonia_id\r\n"
				+ "where a.clave_entidad = ? and a.clave_municipio = ? and a.clave_localidad = ?;";
		@SuppressWarnings("deprecation")
		List<CodDto> dato = this.jdbcTemplate.query(sql, new Object[]{entidad,Municipio,localidad}, new RowMapper<CodDto>() {
            @Override
            public CodDto mapRow(ResultSet rs, int i) throws SQLException {
            	CodDto f = new CodDto();
            	TipoColonia col = new TipoColonia();

            	f.setClasificacion(rs.getLong("clasificacion"));
            	col.setDescripcion(rs.getString("descripcion"));
            	f.setNombreColonia(rs.getString("nombre_colonia"));
            	f.setCp(rs.getInt("cp"));
            	f.setDetalleDescripcion(col);
                return f;
            }
        });
        return dato;
	}



	@Override
	public List<CodDto> getEntMunLocCp(Integer entidad, Integer Municipio, Integer cp) {
		String sql ="Select distinct a.clasificacion,b.descripcion, a.nombre_colonia,lpad(CAST(a.cp AS TEXT), 5, '0') as cp\r\n"
				+ "from geoloc.codigo_dto as a join geoloc.tipo_colonia as b \r\n"
				+ "on a.clasificacion = b.tipo_colonia_id\r\n"
				+ "where a.clave_entidad = ? and a.clave_municipio = ? and a.cp = ?;";
		@SuppressWarnings("deprecation")
		List<CodDto> dato = this.jdbcTemplate.query(sql, new Object[]{entidad,Municipio,cp}, new RowMapper<CodDto>() {
            @Override
            public CodDto mapRow(ResultSet rs, int i) throws SQLException {
            	CodDto f = new CodDto();
            	TipoColonia col = new TipoColonia();

            	f.setClasificacion(rs.getLong("clasificacion"));
            	col.setDescripcion(rs.getString("descripcion"));
            	f.setNombreColonia(rs.getString("nombre_colonia"));
            	f.setCp(rs.getInt("cp"));
            	f.setDetalleDescripcion(col);
                return f;
            }
        });
        return dato;
	}

}
