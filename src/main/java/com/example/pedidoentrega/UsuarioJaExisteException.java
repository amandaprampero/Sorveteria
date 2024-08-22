package com.example.pedidoentrega;

public class UsuarioJaExisteException extends Exception{
    public UsuarioJaExisteException(String mensagem){
        super(mensagem);
    }
}
