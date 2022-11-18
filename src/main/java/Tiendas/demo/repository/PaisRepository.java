
package Tiendas.demo.repository;

import Tiendas.demo.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PaisRepository extends CrudRepository<Pais,Long> {
    
}
