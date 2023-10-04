package com.utn.tpApiNuevo.services;

import com.utn.tpApiNuevo.entities.Base;
import com.utn.tpApiNuevo.entities.Persona;
import com.utn.tpApiNuevo.repositories.BaseRepository;
import com.utn.tpApiNuevo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona,Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

}
