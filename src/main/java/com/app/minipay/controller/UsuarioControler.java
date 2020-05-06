package com.app.minipay.controller;

import com.app.minipay.dto.UsuarioDTO;
import com.app.minipay.entity.Usuario;
import com.app.minipay.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UsuarioControler {

    @Autowired
    private UsuarioService _usuarioService;

    public Usuario Create(@Valid @RequestBody UsuarioDTO dto) {
        return _usuarioService.save(dto.convertUsuario());
    }
}
