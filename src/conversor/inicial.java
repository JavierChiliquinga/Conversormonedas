
package conversor;
import javax.swing.*;
import java.awt.event.*;
public class inicial extends JFrame implements ActionListener  {
	//declaro variables y campos
	private JComboBox<String> combo1;
	private JLabel label1;
	private JButton botonaceptar, botonatras;
	//constructor
    public inicial() {
        setLayout(null);
        //agrego el listado de opciones
        combo1=new JComboBox<String>();
        combo1.setBounds(15,40,250,20);
        add(combo1);
        combo1.addItem("Conversor de Moneda");
        combo1.addItem("Conversor de Temperatura");     
        //agrego texto
        label1=new JLabel("Seleccione una opción de conversión");
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
    //al dar click se activa
    public void actionPerformed(ActionEvent e) {
    	//al dar click en continuar
        if (e.getSource()==botonaceptar) {
        	//si se selecciono el conversor de monedas.
        	if((String)combo1.getSelectedItem() =="Conversor de Moneda") {
        		this.setVisible(false);
        		conversionmonedas convertir=new conversionmonedas();
        		convertir.setBounds(0,0,300,180);
                convertir.setVisible(true);
                convertir.setTitle("Conversor de monedas");
                convertir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	}
        	//Si se selecciono el conversor de temperaturas.
        	if((String)combo1.getSelectedItem() =="Conversor de Temperatura") {
        		this.setVisible(false);
        		conversiontemp convertir=new conversiontemp();
        		convertir.setBounds(0,0,300,180);
                convertir.setVisible(true);
                convertir.setTitle("Conversor de temperaturas");
                convertir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	}
        }
        //si se da click en el boton cancelar
        if(e.getSource()==botonatras) {
        	this.setVisible(false);
        }
    }
}
