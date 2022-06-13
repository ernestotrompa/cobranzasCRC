package com.example18.demo18.repository;

import java.util.List;
import java.util.Optional;

import com.example18.demo18.models.segtblusuarios;

import com.example18.demo18.repository.crud.lsegtblusuariosCrudrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class IsegtblusuariosRepository  {

    
    @Autowired
    private lsegtblusuariosCrudrepository IsegtblusuariosCrudrepository;
    
    public List<segtblusuarios> getAll() {
        return (List<segtblusuarios>) IsegtblusuariosCrudrepository.findAll();
    }

    public Optional<segtblusuarios> getSegtblusuarios(int id) {
        return IsegtblusuariosCrudrepository.findById(id);
    }
    
    
    public segtblusuarios save(segtblusuarios segtblusuarios) {
        return IsegtblusuariosCrudrepository.save(segtblusuarios);
    }
    
   

    public boolean existeUsuario(String segtblusuarios) {
        Optional<segtblusuarios> tusuario = IsegtblusuariosCrudrepository.findByTusuario(segtblusuarios);

        return !tusuario.isEmpty();
    }

    /*
    public Optional<segtblusuarios> autenticarUsuario(String tusuario, String password) {
        return IsegtblusuariosCrudrepository.findByTusarioAndPassword(tusuario, password);
    }
    */
    
    

}
