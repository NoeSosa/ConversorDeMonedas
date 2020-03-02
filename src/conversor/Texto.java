
package conversor;

import javax.swing.*;

/**
 *
 * @author SP314-51
 */
public class Texto {
    public JTextField TexMXN;
    public JTextField TexDL;
    public JTextField valor;
    
    
    public Texto(){
        TexMXN= new JTextField("Pesos", 10);
        TexDL= new JTextField("Dolares", 10);
        //obtencion del valor
        valor= new JTextField(10);
        //Resultado 
        
        PropiedadesTex();
    }
    public void PropiedadesTex(){
        //cajas de texto ubicacion
        TexMXN.setBounds(50,25,60,30);
        TexDL.setBounds(250,25,60,30);
        //marcar como no editables
        TexMXN.setEditable(false);
        TexDL.setEditable(false);
        //Tamaño de la caja del valor
        valor.setBounds(150,70,70,30);
        //Propiedades del texto
        
        
       
        
    }
    
}
