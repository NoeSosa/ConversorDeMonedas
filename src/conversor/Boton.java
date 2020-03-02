/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import javax.swing.*;
public class Boton {
    
    public JButton BotInv;
    public JButton BotConv;
    
    
    public Boton(){
        BotInv= new JButton();
        BotConv= new JButton();
        PropiedadesBot();
        
    }
    public void PropiedadesBot(){
        //boton A
        BotInv.setText("A");
        BotInv.setBounds(150,25,60,30);
        //boton convertir
        BotConv.setText("Convertir");
        BotConv.setBounds(135,150,100,30);
    }
    
    
}
