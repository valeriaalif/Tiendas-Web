
package Tiendas.demo.service;

import Tiendas.demo.entity.Pais;
import Tiendas.demo.entity.Persona;
import Tiendas.demo.repository.PaisRepository;
import Tiendas.demo.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    public List<Persona> getAllPersona(){
        
        return (List<Persona>) personaRepository.findAll();
        
    }
    
    public Persona getPersonaById(long id){
        
        return (Persona) personaRepository.findAllById(id);
        
    }
    
    public void savePersona(Persona persona){
        
        personaRepository.save(persona);
    }
    
    public void delete(long id){
        personaRepository.deleteById(id);
    }
  
    }



