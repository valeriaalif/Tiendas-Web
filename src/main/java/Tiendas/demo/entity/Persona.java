
package Tiendas.demo.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author valer
 */
@Entity
@Table(name= "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    
    @ManyToOne
    @JoinColumn(name="paises_id")
    private Pais pais;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
