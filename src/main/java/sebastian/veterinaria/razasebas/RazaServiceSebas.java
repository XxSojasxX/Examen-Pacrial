package sebastian.veterinaria.razasebas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RazaServiceSebas {
    @Autowired
    private RazaRepositorySebas razaRepositorySebas;

    //INSERT
    public RazaSebas sebasSave(RazaSebas entity){
        return razaRepositorySebas.save(entity);
    }

    //SELECT
    public RazaSebas sebasFindById(Long id) {
        return razaRepositorySebas.findById(id).orElse(null);
    }              
    
    //SELECT ALL
    public List<RazaSebas> sebasFindAll(){
        Iterable<RazaSebas> iterable = razaRepositorySebas.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    //DELETE
    public void sebasDeleteById(Long id){
        razaRepositorySebas.deleteById(id);
    }

    //delete por nombre de raza
    public void sebasDeleteByNombre (String nombreRaza){
        razaRepositorySebas.deleteByNombreRaza(nombreRaza);
    }
}
