
package Tiendas.demo.service;

import Tiendas.demo.entity.Pais;
import Tiendas.demo.entity.Persona;
import Tiendas.demo.repository.PaisRepository;
import Tiendas.demo.repository.PersonaRepository;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

   

    
    
    @Autowired
     private PersonaRepository personaRepository;
    
    @Override
    public List<Persona> getAllPersona(){
        
        return (List<Persona>) personaRepository.findAll();
        
    }
    @Override
    public Persona getPersonaById(long idPersona){
       return personaRepository.findById(idPersona).orElse(null);
      
    }
    
    @Override
    public void savePersona(Persona persona){
        
        personaRepository.save(persona);
    }
    
    @Override
    public void delete(long id){
        personaRepository.deleteById(id);
    }

    @Override
    public Persona getPersonabyId(long idPersona) {
        return personaRepository.findAllById(idPersona);
    }



   


  
    }



