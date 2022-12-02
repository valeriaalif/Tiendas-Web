
package Tiendas.demo.repository;

import Tiendas.demo.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {

    public Persona findAllById(long idPersona);



   
    
}
