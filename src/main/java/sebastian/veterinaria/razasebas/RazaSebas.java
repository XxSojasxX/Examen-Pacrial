package sebastian.veterinaria.razasebas;

import lombok.Data;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data

public class RazaSebas {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre_raza;
    private Date fecha_creacion;
    private Boolean vacunado;

    
}
