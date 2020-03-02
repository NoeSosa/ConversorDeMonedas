
package conversor;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.BevelBorder;
import ConversorMonedas.ConversorMonedas;
import Contador.Contador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
/**
 *
 * @author SP314-51
 */
public class GUI extends JFrame{
    Contador con = new Contador();
    ConversorMonedas conv = new ConversorMonedas();
    Texto jla = new Texto();
    DecimalFormat formato = new DecimalFormat("#.00");
    public JLabel ven;
    public Container contenedor;
    public JLabel resul;
    
    public GUI(){
        contenedor=getContentPane();
        resul =new JLabel();
        ven= new JLabel();
        setTitle("Conversor");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        componentes();
    }
    public void componentes(){
        //Panel de acciones 
        ven.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
        ven.setPreferredSize(new Dimension (400, 400));
        ven.setSize(400, 300);
        //Resultado
         
        
        
        
        //Añadir Cajas de texto
        
        ven.add(jla.TexMXN);
        ven.add(jla.TexDL);
        ven.add(jla.valor);
        //Añadir Botones
        Boton jbu = new Boton();
        ven.add(jbu.BotInv);
        ven.add(jbu.BotConv); 
        //Añade el texto del resultado
        resul.setBounds(150,100,100,30);
        //añadir el jlabel
        ven.add(resul);
        //Creacion de oyentes
        OyenteBotInv oBotInv= new OyenteBotInv();
        OyenteBotConv oBotConv= new OyenteBotConv();
        //añadir oyenye al boton
        jbu.BotInv.addActionListener((ActionListener)oBotInv);
        jbu.BotConv.addActionListener((ActionListener)oBotConv);
        
        //Añadir el contenedor
        contenedor.add(ven, BorderLayout.NORTH);
        
    }

    

    private class OyenteBotInv implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            con.incrementa();
            
            if (con.getPulsaciones()%2==0){
                jla.TexMXN.setText("Pesos");
                jla.TexDL.setText("Dolares");
            }else{
                jla.TexMXN.setText("Dolares");
                jla.TexDL.setText("Pesos");
            }
            
        }
    }
    private class OyenteBotConv implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            float num;
            num=Float.parseFloat(jla.valor.getText());
            
            if (con.getPulsaciones()%2==0){
                resul.setText(""+ formato.format(conv.PesoADolar(num)) +" Dolares");
                
            }else{
                resul.setText(""+ formato.format(conv.DolarAPeso(num)) +" Pesos");
                
                
            }
            
        }
    }
}
