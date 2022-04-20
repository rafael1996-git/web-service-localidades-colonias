package com.ine.cartografia.service;

import java.util.List;

import com.ine.cartografia.entity.CodDto;

public interface IDaoReposiory {

	public List<CodDto> get(Integer entidad);
	public List<CodDto> getEntMun(Integer entidad,Integer Municipio);
	public List<CodDto> getEntMunLoc(Integer entidad,Integer Municipio,Integer localidad);
	public List<CodDto> getEntMunLocCp(Integer entidad,Integer Municipio,Integer cp);

	
}
