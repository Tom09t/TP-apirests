package com.utn.tpApiNuevo.repositories;

import com.utn.tpApiNuevo.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long>{

}

