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
public class MainAsta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creo bancone con articoli
        Bancone ba=new Bancone();
        ba.aggArtiBancone();
        JOptionPane.showMessageDialog(null,"Elenco articoli\n"+ba.stampaBancone());
        
        //inizio persona 1
        String nome= JOptionPane.showInputDialog("Inserire nome");
        String cognome= JOptionPane.showInputDialog("Inserire cognome");
        Persona p1= new Persona(nome, cognome, 4000);

        Articoli arti= null;
        String input= JOptionPane.showInputDialog("Inserire l'articolo di cui si vuole fare l'offerta");
        arti=ba.trovaArticolo(input);
        double off=Double.parseDouble(JOptionPane.showInputDialog("Inserire il valore dell'offerta"));
        Offerte o= new Offerte(off,nome, cognome);   
        //controllo se ha abbastanza soldi
        if(p1.soldiSuff(arti,o)==true)
            arti.aggOfferta(o);
        else
            JOptionPane.showMessageDialog(null, "Non hai abbastanza soldi per comprare l'articolo");
        
        
        //inzio persona 2
        nome= JOptionPane.showInputDialog("Inserire nome");
        cognome= JOptionPane.showInputDialog("Inserire cognome");
        Persona p2= new Persona(nome, cognome, 2000);
        
        input= JOptionPane.showInputDialog("Inserire l'articolo di cui si vuole fare l'offerta");
        arti=ba.trovaArticolo(input);
        off=Double.parseDouble(JOptionPane.showInputDialog("Inserire il valore dell'offerta"));
        Offerte o2= new Offerte(off,nome, cognome);   
        //controllo se ha abbastanza soldi
        if(p2.soldiSuff(arti,o2)==true)
            arti.aggOfferta(o2);
        else
            JOptionPane.showMessageDialog(null, "Non hai abbastanza soldi per comprare l'articolo");                   
        //fine persona 2
        
        //per sottrarre i soldi
        if(o.getValore()>o2.getValore())
            p1.togliSoldiArticolo(arti);
        else
            p2.togliSoldiArticolo(arti);
                
        //inizio stampa
        System.out.println("Elenco articoli \n"+ba.stampaBancone());
        System.out.println("Oggetto: "+arti.getDescrizione()+". Elenco offerte\n"+arti.stampaOfferte());
        
        
        System.out.println(arti.visualizzaOffMaggiore());
        
    }
    
}
