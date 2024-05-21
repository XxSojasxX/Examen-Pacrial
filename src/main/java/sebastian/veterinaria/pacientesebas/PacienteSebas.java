package sebastian.veterinaria.pacientesebas;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import sebastian.veterinaria.razasebas.RazaSebas;

@Entity
@Data
public class PacienteSebas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre_paciente;
    private Integer edad_paciente;
    private Date fecha_ingreso; 

    @ManyToOne
    private RazaSebas razaSebas;

}
