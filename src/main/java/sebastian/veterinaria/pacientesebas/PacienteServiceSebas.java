package sebastian.veterinaria.pacientesebas;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceSebas {
    
    @Autowired
    private PacienteRepositorySebas pacienteRepositorySebas;

    //insert
    public PacienteSebas sebasSave(PacienteSebas entity){
        return pacienteRepositorySebas.save(entity);
    }

    //select
    public PacienteSebas sebasFindByid(Long id){
        return pacienteRepositorySebas.findById(id).orElse(null);
    }

    //select all 
    public List<PacienteSebas> sebasFindAll(){
        Iterable<PacienteSebas> iterable = pacienteRepositorySebas.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    //delete
    public void sebasDeleteById(Long id){
        pacienteRepositorySebas.deleteById(id);
    }
}
