/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainasta;

/**
 *
 * @author tss
 */
public class Offerte {

    private double valore;
    private String nome;
    private String cognome;

    public Offerte(double valore, String nome, String cognome) {
        this.valore = valore;
        this.nome = nome;
        this.cognome = cognome;
    } 

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public double getValore() {
        return valore;
    }   
}
