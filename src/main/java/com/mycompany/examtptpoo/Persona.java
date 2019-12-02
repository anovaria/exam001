
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examtptpoo;

import java.time.LocalDateTime;

/**
 *
 * @author tss
 */
public class Persona {

    String cognome;
    String nome;
    Integer dataNascita;
    String fascia;
    LocalDateTime datan;
    public Persona(String cognome, String nome, Integer dataNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.dataNascita = dataNascita;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDataNascita() {
        return dataNascita;
    }

    public String getInfoP() {
        return "Nome: " + getCognome() + " \ncognome: " + getNome() + " \nData nascita: " + getDataNascita()+  " \nEtà: " + getEta()+" \nFascia: " + getFascia();
    }
public Integer getEta(){
        Integer ris=0;
            datan = LocalDateTime.now();
            int anno = datan.getYear();
            ris= anno - this.dataNascita;
        return ris;
    }
    public String getFascia() {
        Integer dt = getEta();
        String ris = "";
        if (dt < 18 && dt > 0) {
            ris= "junior";
        }
        if (dt > 18 && dt < 60) {
            ris = "senior";
        }
        if (dt > 60) {
            ris = "over";
        }
        return ris;
    }
    
}
