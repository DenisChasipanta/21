package com.Inamhi.Solicitud2.repositorio;

import com.Inamhi.Solicitud2.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
