package sebastian.veterinaria.razasebas;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface RazaRepositorySebas extends CrudRepository<RazaSebas, Long> {
  
    @Modifying
    @Transactional
    @Query("DELETE FROM RazaSebas r WHERE r.nombre_raza = ?1")
    void deleteByNombreRaza(String nombreRaza);
}
