package com.example18.demo18.service;

import com.example18.demo18.models.segtblusuarios;
import com.example18.demo18.repository.IsegtblusuariosRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IsegtblusuariosService {
    
    @Autowired
    private IsegtblusuariosRepository isegtblusuariosRepository;

    public List<segtblusuarios> getAll() {
        return isegtblusuariosRepository.getAll();
    }

    public Optional<segtblusuarios> getSegtblusuarios(int id) {
        return isegtblusuariosRepository.getSegtblusuarios(id);
    }


     
    public segtblusuarios registrar(segtblusuarios segtblusuarios) {
        if (segtblusuarios.getTusuario() == null) {
            if (existeUsuario(segtblusuarios.getTusuario()) == false) {
                return isegtblusuariosRepository.save(segtblusuarios);
            } else {
                return segtblusuarios;
            }
        } else {
            return segtblusuarios;
        }
    }

   
    public boolean existeUsuario(String tusuario) {
        return isegtblusuariosRepository.existeUsuario(tusuario);
    }
    
    /*
    public segtblusuarios autenticarUsuario(String tusuario, String password) {
        Optional<segtblusuarios> usuario = isegtblusuariosRepository.autenticarUsuario(tusuario, password);

        if (usuario.isEmpty()) {
            return new segtblusuarios(tusuario, password, "NO DEFINIDO");
        } else {
            return  tusuario.getSegtblusuarios();
        }
    }

    */
}