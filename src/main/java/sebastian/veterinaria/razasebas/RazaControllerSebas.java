package sebastian.veterinaria.razasebas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/razas")
public class RazaControllerSebas {
    @Autowired
    private RazaServiceSebas razaServiceSebas;

    // CREATE
    @PostMapping
    public RazaSebas sebasSave(@RequestBody RazaSebas entity) {
        return razaServiceSebas.sebasSave(entity);
    }

    // SELECT
    @GetMapping("/{id}")
    public RazaSebas sebasFindById(@PathVariable Long id) {
        return razaServiceSebas.sebasFindById(id);
    }

    // SELECT ALL
    @GetMapping
    public List<RazaSebas> sebasFindAll() {
        return razaServiceSebas.sebasFindAll();
    }

    // UPDATE
    @PutMapping
    public RazaSebas sebasUpdate(@RequestBody RazaSebas entity) {
        return razaServiceSebas.sebasSave(entity);
    }

    // DELETE by ID
    @DeleteMapping("/{id}")
    public void sebasDelete(@PathVariable Long id) {
        razaServiceSebas.sebasDeleteById(id);
    }

    // DELETE by Nombre
    @DeleteMapping("/nombre/{nombreRaza}")
    public void sebasDeleteByNombre(@PathVariable String nombreRaza) {
        razaServiceSebas.sebasDeleteByNombre(nombreRaza);
    }
}

