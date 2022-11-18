
package Tiendas.demo.repository;

import Tiendas.demo.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {

    public Object findAllById(long id);

    public void delete(long id);
    
}
