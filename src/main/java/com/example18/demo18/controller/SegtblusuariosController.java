package com.example18.demo18.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example18.demo18.models.segtblusuarios;
import com.example18.demo18.service.IsegtblusuariosService;


/**
 * 
 */

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class SegtblusuariosController {
    @Autowired
    private IsegtblusuariosService isegtblusuariosService;

    @GetMapping("/segtblusuariosall")
    public List<segtblusuarios> getAllSegtblusuarios() {
        return isegtblusuariosService.getAll();
    }
    
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public segtblusuarios registrar(@RequestBody segtblusuarios segtblusuarios) {
        return isegtblusuariosService.registrar(segtblusuarios);
    }
    

    @GetMapping("/{tusuario}")
    public boolean existeUsuario(@PathVariable("segtblusuarios") String segtblusuarios) {
        return isegtblusuariosService.existeUsuario(segtblusuarios);
    }
    
    /* 
    @GetMapping("/{tusuario}/{password}")
    public segtblusuarios autenticarUsuario(@PathVariable("tusuario") String tusuario, @PathVariable("password") String password) {
        return isegtblusuariosService.autenticarUsuario(tusuario, password);
    }
    */

}

