package com.app.minipay.dto;

import com.app.minipay.entity.Usuario;
import lombok.Getter;

@Getter
public class UsuarioDTO {
    private String nome;
    private String email;

    public Usuario convertUsuario(){
        return new Usuario(getNome(), getEmail());

    }
}
