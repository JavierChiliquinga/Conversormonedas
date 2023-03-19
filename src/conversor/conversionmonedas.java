
package conversor;
import javax.swing.*;
import java.awt.event.*;
public class conversionmonedas extends JFrame implements ActionListener  {
	//variables y campos
	private JComboBox<String> combo1;
	private JLabel label1;
	private JButton botonaceptar, botonatras;
	//opcion seleccionada.
	private String OP;
    public conversionmonedas() {
        setLayout(null);
        //listado de opciones
        combo1=new JComboBox<String>();
        combo1.setBounds(15,40,250,20);
        add(combo1);
        combo1.addItem("Dolar a Euro");
        combo1.addItem("Dolar a Libras Esterlinas");
        combo1.addItem("Dolar a Yen Japones");
        combo1.addItem("Dolar a Won sur-Coreano");
        combo1.addItem("Dolar a Pesos mexicanos");
        combo1.addItem("Euro a Dolar");
        combo1.addItem("Libras esterlinas a Dolar");
        combo1.addItem("Yen Japones a Dolar");
        combo1.addItem("Won sur-Coreano a Dolar");
        combo1.addItem("Pesos mexicanos a Dolar");   
        //texto indicativo
        label1=new JLabel("Seleccione una conversion de moneda");
        label1.setBounds(10,10,250,30);
        add(label1);
        //agrego boton continuar
        botonaceptar=new JButton("Continuar");
        botonaceptar.setBounds(20,80,100,30);
        add(botonaceptar);
        //agrego la accion de dar click
        botonaceptar.addActionListener(this);
        //agrego el boton de atras
        botonatras=new JButton("Cancelar");
        botonatras.setBounds(160,80,100,30);
        add(botonatras);
        botonatras.addActionListener(this);
        
        }
    public void actionPerformed(ActionEvent e) {
    	// si se presiona continuar.
        if (e.getSource()==botonaceptar) {
           this.OP=(String)combo1.getSelectedItem();
           ingresovalor ingreso=new ingresovalor(this.OP);
           ingreso.setBounds(0,0,350,160);
           ingreso.setVisible(true);
           ingreso.setTitle("ingreso");
           ingreso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setVisible(false);
        }
        //si se presiona cancelar
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
		return this.OP;
	}   
    
    
    
    
    
}
