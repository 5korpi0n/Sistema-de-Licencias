package com.cdainfo.vacaciones.repository;


import java.util.Date;

//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cdainfo.vacaciones.entity.Peticion;



@Repository
	
	public interface PeticionRepository extends JpaRepository<Peticion,Long> {
	
	//List<PeticionEntity> findAllByFechaBetween(Date desde, Date hasta);
    Peticion findAllByTipoDeLicencia(String tipoLicencia);
    Peticion findAllByCantidadDias(Date cantidadDias);
    Peticion findAllByEstado(String estado);
    
}
