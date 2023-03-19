
package conversor;

import javax.swing.*;
import java.awt.event.*;

public class pestfinal extends JFrame implements ActionListener {
	private JComboBox<String> combo1;
	private double valor;
	private JLabel label1;
	private JButton botonaceptar, botonsalir;

	public pestfinal(String OP, String numero) {
		setLayout(null);
		// agrego texto superior
		label1 = new JLabel();
		//label1.setText("nuevo texto");
		label1.setBounds(120, 20, 350, 30);
		label1.setText("Deseas continuar?");
		add(label1);
		// agrego boton si
		botonaceptar = new JButton("Si");
		botonaceptar.setBounds(40, 60, 100, 30);
		add(botonaceptar);
		botonaceptar.addActionListener(this);
		// agrego boton no
		botonsalir = new JButton("No");
		botonsalir.setBounds(180, 60, 100, 30);
		add(botonsalir);
		botonsalir.addActionListener(this);
		
		// agrego la accion de dar click
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonaceptar) {
			inicial inicio1=new inicial();
		    inicio1.setBounds(0,0,300,180);
		    inicio1.setVisible(true);
		    inicio1.setTitle("Menu");
		    inicio1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setVisible(false);
		}
		if (e.getSource() == botonsalir) {
			this.setVisible(false);
		}
		
	}
}
