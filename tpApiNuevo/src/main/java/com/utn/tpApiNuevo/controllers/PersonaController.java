package com.utn.tpApiNuevo.controllers;

import com.utn.tpApiNuevo.entities.Persona;
import com.utn.tpApiNuevo.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")

public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}
