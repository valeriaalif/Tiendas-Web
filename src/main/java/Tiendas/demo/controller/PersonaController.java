
package Tiendas.demo.controller;

import Tiendas.demo.entity.Pais;
import Tiendas.demo.entity.Persona;
import Tiendas.demo.service.IPaisService;
import Tiendas.demo.service.IPersonaService;
import Tiendas.demo.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


public class PersonaController {
    
    @Autowired
    private IPersonaService personaService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/persona")
    public String index(Model model){
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";
    }
    
    @GetMapping("/personaN")
    public String crearPersona(Model model){
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
    
    @GetMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona){
        personaService.savePersona(persona);
        return "redirect:/persona";
        
    }
    
    @GetMapping("/editPersona/(id)")
    public String editarPersona(@PathVariable("id")Long id, Model model){
       Persona persona = PersonaService.getPersonabyId(id);
       List<Pais> listaPaises = paisService.listCountry();
       model.addAttribute("persona", persona);
       model.addAttribute("paises", listaPaises);
       return "crear";
    }
    
}
