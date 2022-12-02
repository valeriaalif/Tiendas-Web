
package Tiendas.demo.service;

import Tiendas.demo.entity.Persona;
import java.util.List;


public interface IPersonaService {

    public List<Persona> getAllPersona();

    public void savePersona(Persona persona);
    
    public void delete(long id);
    
    public Persona getPersonaById(long idPersona);

    public Persona getPersonabyId(long idPersona);



  

   
    
}
