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
public class Bancone {
    
    private ArrayList<Articoli> articolo=new ArrayList<Articoli>(); 
    
    public void aggArtiBancone(){
        boolean continua=true;
        //int nmax= Integer.parseInt(JOptionPane.showInputDialog("Inserire quanti articoli")); 
        for(int i=0;continua==true;i++){
            String input = JOptionPane.showInputDialog("Inserire descrizione dell'articolo o \nlasciare vuoto per finire");
            if(input.equals(""))
                continua=false;  
            else{
                double valore= Double.parseDouble(JOptionPane.showInputDialog("Inserire valore iniziale dell'articolo"));
                Articoli a= new Articoli(input, valore );
                articolo.add(a);                            
            }
        }
    }
    
    public String stampaBancone(){
        String report="";
        for(int i=0;i<articolo.size();i++){
            report+=articolo.get(i).getDescrizione()+"- "+articolo.get(i).getCosto()+"\n";
        }
        return report;
    }
    
    public Articoli trovaArticolo(String elemento){
        Articoli art=null;
        for(int i=0;i<articolo.size();i++){
            if(elemento.equalsIgnoreCase(articolo.get(i).getDescrizione()))
                art=articolo.get(i);
        }
        return art;
    }  
}
