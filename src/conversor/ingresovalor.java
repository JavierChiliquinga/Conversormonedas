
package conversor;
import javax.swing.*;
import java.awt.event.*;
public class ingresovalor extends JFrame implements ActionListener  {
	private JComboBox<String> combo1;
	private JLabel label1;
	private JTextField textoingreso;
	private JButton botonaceptar, botonatras;
	private String OP;
    public ingresovalor(String opc) {
        this.OP=opc;
    	setLayout(null);
        //agrego texto superior
        label1=new JLabel("Ingresa la cantidad de dinero que deseas convertir");
        label1.setBounds(20,10,350,30);
        add(label1);
        //agregar cuadro para ingresar texto
        textoingreso=new JTextField();
        textoingreso.setBounds(20,45,290,20);
        add(textoingreso);
        //agrego boton continuar
        botonaceptar=new JButton("Continuar");
        botonaceptar.setBounds(40,80,100,30);
        add(botonaceptar);
        //agrego la accion de dar click
        botonaceptar.addActionListener(this);
        //agrego el boton de atras
        botonatras=new JButton("Cancelar");
        botonatras.setBounds(190,80,100,30);
        add(botonatras);
        botonatras.addActionListener(this);
        
        }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==botonaceptar) {
           String numero=textoingreso.getText();
           resultado resul= new resultado(this.OP, numero);
   			resul.setBounds(0, 0, 350, 160);
   			resul.setVisible(true);
   			resul.setTitle("Resultado");
   			resul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   			this.setVisible(false);
        }
        if(e.getSource()==botonatras) {
        	inicial inicio1=new inicial();
            inicio1.setBounds(0,0,300,180);
            inicio1.setVisible(true);
            inicio1.setTitle("Menu");
            inicio1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(false);
        }
    } 
}
