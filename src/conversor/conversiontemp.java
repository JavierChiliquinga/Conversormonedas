
package conversor;
import javax.swing.*;
import java.awt.event.*;
public class conversiontemp extends JFrame implements ActionListener  {
	private JComboBox<String> combo1;
	private JLabel label1;
	//variable para la opcion seleccionada
	private String OP;
	private JButton botonaceptar, botonatras;
    public conversiontemp() {
        setLayout(null);
        //listado de opciones
        combo1=new JComboBox<String>();
        combo1.setBounds(15,40,250,20);
        add(combo1);
        combo1.addItem("Centigrados a Farenheit");
        combo1.addItem("Centigrados a Kelvin");
        combo1.addItem("Farenheit a Centigrados");
        combo1.addItem("Kelvin a Centigrados");
        combo1.addItem("Farenheit a Kelvin");
        combo1.addItem("Kelvin a Farenheit");     
        label1=new JLabel("Seleccione una conversión de temperatura");
        label1.setBounds(10,10,250,30);
        add(label1);
        //agrego boton continuar
        botonaceptar=new JButton("Continuar");
        botonaceptar.setBounds(20,80,100,30);
        add(botonaceptar);
        //agrego la accion de dar click
        botonaceptar.addActionListener(this);
        //agrego el boton de atras
        botonatras=new JButton("Atras");
        botonatras.setBounds(160,80,100,30);
        add(botonatras);
        botonatras.addActionListener(this);
        
        }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==botonaceptar) {
           this.OP=(String)combo1.getSelectedItem();
           ingresovalor ingreso=new ingresovalor(this.OP);
           ingreso.setBounds(0,0,350,160);
           ingreso.setVisible(true);
           ingreso.setTitle("Ingreso");
           ingreso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setVisible(false);
           //setTitle(seleccionado);
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
	public String getOP() {
		return OP;
	}   
    
    
    
    
    
}
