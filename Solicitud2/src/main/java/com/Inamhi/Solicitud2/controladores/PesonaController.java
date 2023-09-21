package com.Inamhi.Solicitud2.controladores;

import com.Inamhi.Solicitud2.entidad.Persona;
import com.Inamhi.Solicitud2.repositorio.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class PesonaController {
    @Autowired
    PersonaRepository personaRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("persona", new Persona());
        return "index";
    }
    @GetMapping("/listado")
    public String listado(){
        return "listadoPersonas";
    }
    @GetMapping("/listado/editar/{codigo}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona> personas = personaRepository.findById(id);
        model.addAttribute("personas", personas );
        return "/index";
    }

    //ELIMINAR
    @GetMapping("/listado/eliminar/{codigo}")
    public  String eliminar(@PathVariable Integer codigo){
        personaRepository.deleteById(codigo);
        return "redirect:/listado";
    }
}
