package com.example18.demo18.repository.crud;


import java.util.Optional;

import com.example18.demo18.models.segtblusuarios;
import org.springframework.data.repository.CrudRepository;


public interface lsegtblusuariosCrudrepository  extends CrudRepository <segtblusuarios, Integer> {
   
    
    Optional<segtblusuarios> findByTusuario(String Tusuario);
    //Optional<segtblusuarios> findByTusuarioAndPassword(String Tusuario,String password); 
    


}
