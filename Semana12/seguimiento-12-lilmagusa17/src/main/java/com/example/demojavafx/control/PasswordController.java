package com.example.demojavafx.control;

import com.example.demojavafx.model.Password;

public class PasswordController {

    //SINGLETON
    private static PasswordController passwordController;
    private Password password;

    private PasswordController(){
        password = new Password();

    }

    public static PasswordController getInstance(){
        if(passwordController == null){
            passwordController = new PasswordController();
        }
        return passwordController;
    }

    public boolean abrirCaja(String p1, String p2, String p3, String p4, String p5, String p6) {
       StringBuilder sb = new StringBuilder();
       sb.append(p1);
       sb.append(p2);
       sb.append(p3);
       sb.append(p4);
       sb.append(p5);
       sb.append(p6);
       String kw = sb.toString();
       //FIXME
       Password pass = new Password(kw);
       getContent();

       //TODO corregido por avillota
       return password.verifyKW(kw);

    }

    //getters and setters
    public String getPassword() {
        return password.getKeyWord();
    }

    public void setPassword(String kw) {
        this.password.setKeyWord(kw);
    }

    public String getContent() {
        return password.getContent();
    }

    public void setContent(String content) {
        password.setContent(content);
    }


}
