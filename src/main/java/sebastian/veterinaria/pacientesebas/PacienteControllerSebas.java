package sebastian.veterinaria.pacientesebas;

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
@RequestMapping("/pacientes")
public class PacienteControllerSebas {
    
    @Autowired
    private PacienteServiceSebas pacienteServiceSebas;

    //Create
    @PostMapping
    public PacienteSebas sebasSave(@RequestBody PacienteSebas entity)
    {
        return pacienteServiceSebas.sebasSave(entity);
    }

    //Select
    @GetMapping("/{id}/")
    public PacienteSebas sebasfindById(@PathVariable Long id)
    {
        return pacienteServiceSebas.sebasFindByid(id);
    }

    //Select All
    @GetMapping
    public List<PacienteSebas> sebasFindAll(){
        return pacienteServiceSebas.sebasFindAll();
    }

    //Update
    @PutMapping
    public PacienteSebas sebasUpdate(@RequestBody PacienteSebas entity)
    {
        return pacienteServiceSebas.sebasSave(entity);
    }

    //Delete
    @DeleteMapping("/{id}/")
    public void sebasDelete(@PathVariable Long id){
        pacienteServiceSebas.sebasDeleteById(id);
    }
}
