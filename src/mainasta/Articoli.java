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
public class Articoli {
    
    private String descrizione;
    private double costo;
    private ArrayList<Offerte> offerta;
    
    public Articoli(String descrizione, double costo) {
        offerta = new ArrayList<Offerte>();
        this.descrizione = descrizione;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDescrizione() {
        return descrizione;
    }    
    
    public void aggOfferta(Offerte o){
        if(o.getValore()>costo)
            offerta.add(o);
        else
            JOptionPane.showMessageDialog(null,"Offerta troppo bassa");
    }
    
    public String visualizzaOffMaggiore(){
        String report="";
        String nome=offerta.get(0).getNome(), cognome=offerta.get(0).getCognome();
        double max=offerta.get(0).getValore();
        for(int i=1;i<offerta.size();i++){  
            if(offerta.get(i).getValore()>max){
                max=offerta.get(i).getValore();
                nome=offerta.get(i).getNome();
                cognome=offerta.get(i).getCognome();
            }
        }
        report="Offerta maggiore: "+max+" euro, di "+nome+" "+cognome;
        return report;
    }
    
    public double offMaggiore(){        
        double max=offerta.get(0).getValore();
        for(int i=1;i<offerta.size();i++){  
            if(offerta.get(i).getValore()>max){
                max=offerta.get(i).getValore();
            }
        }
        return max;
    }
    
     public String stampaOfferte(){
        String report="";
        for(int i=0;i<offerta.size();i++){
            report+=offerta.get(i).getNome()+" "+offerta.get(i).getCognome()+offerta.get(i).getValore()+"\n";
        }
        return report;
    }
    
}
