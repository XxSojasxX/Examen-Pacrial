package sebastian.veterinaria.pacientesebas;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface PacienteRepositorySebas extends CrudRepository<PacienteSebas, Long>{

    
    
}
