/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainasta;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Persona {
    
    private String nome;
    private String cognome;
    private double soldi;

    public Persona(String nome, String cognome, double soldi) {
        this.nome = nome;
        this.cognome = cognome;
        this.soldi = soldi;       
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public double getSoldi() {
        return soldi;
    }    
    
    public boolean soldiSuff(Articoli a, Offerte o){
        boolean acquisto=true;
        if(soldi<a.getCosto() || soldi<o.getValore()){                      
            acquisto=false;
        }   
        return acquisto;
    }
    
    public void togliSoldiArticolo(Articoli a){
        soldi-=a.offMaggiore();
    }
    
    /*public String stampaAr(){
        String ris="Non ho comprato degli articoli";
        String elenco="";
        for(int i=0;i<articolo.size();i++){
            elenco+= articolo.get(i).getDescrizione()+" - "+articolo.get(i).getCosto()+"\n";
        }        
        if(elenco.equals("")==true)
            return ris;
        else
            return elenco;
    }*/
}
