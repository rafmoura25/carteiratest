package com.app.minipay.entity;

import com.app.minipay.util.enums.RegraEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Usuario extends Carteira {
    private long id;
    private String senha;
    private String nome;
    private String email;
    private RegraEnum regra;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
}
