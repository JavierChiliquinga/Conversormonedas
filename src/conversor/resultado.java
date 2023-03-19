
package conversor;

import javax.swing.*;
import java.awt.event.*;

public class resultado extends JFrame implements ActionListener {
	private JComboBox<String> combo1;
	private double valor;
	private JLabel label1;
	private JButton botonaceptar, botonatras;

	public resultado(String OP, String numero) {
		setLayout(null);
		// agrego texto superior
		label1 = new JLabel();
		//label1.setText("nuevo texto");
		label1.setBounds(100, 30, 350, 30);
		add(label1);
		encontrarresult(OP, numero);
		// agrego boton continuar
		botonaceptar = new JButton("Continuar");
		botonaceptar.setBounds(120, 80, 100, 30);
		add(botonaceptar);
		// agrego la accion de dar click
		botonaceptar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonaceptar) {
			pestfinal pesfinal = new pestfinal("ssd","dds");
			pesfinal.setBounds(0, 0, 350, 160);
			pesfinal.setVisible(true);
			pesfinal.setTitle("Resultado");
			pesfinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(false);
		}
	}
	private void encontrarresult(String OP, String numero) {
		double resultado = 0;
		double resultadored=0;
		String texto="";
		monedas moneda=new monedas();
		if (OP == "Dolar a Euro") {
			resultado= moneda.dolareuro(numero);
			if(resultado!=0.0) {
			this.label1.setText("Tienes: "+Double.toString(Math.round(resultado*100.0)/100.0)+" Euros.");
			}
		}
		if (OP == "Dolar a Libras Esterlinas") {
			resultado= moneda.dolarlib(numero);
			if(resultado!=0.0) {
			this.label1.setText("Tienes: "+Double.toString(Math.round(resultado*100.0)/100.0)+" Libras esterlinas.");}
		}
		if (OP == "Dolar a Yen Japones") {
			resultado= moneda.dolaryen(numero);
			if(resultado!=0.0) {
			this.label1.setText("Tienes: "+Double.toString(Math.round(resultado*100.0)/100.0)+" Yenes.");}
		}
		if (OP == "Dolar a Won sur-Coreano") {
			resultado= moneda.dolarwon(numero);
			if(resultado!=0.0) {
			this.label1.setText("Tienes: "+Double.toString(Math.round(resultado*100.0)/100.0)+" Wons.");}
		}
		if (OP == "Dolar a Pesos mexicanos") {
			resultado= moneda.dolarpesos(numero);
			if(resultado!=0.0) {
			this.label1.setText("Tienes: "+Double.toString(Math.round(resultado*100.0)/100.0)+" Pesos MX.");}
		}
		if (OP == "Euro a Dolar") {
			resultado= moneda.eurodolar(numero);
			if(resultado!=0.0) {
			this.label1.setText("Tienes: "+Double.toString(Math.round(resultado*100.0)/100.0)+" Dolares.");}
		}
		if (OP == "Libras esterlinas a Dolar") {
			resultado= moneda.libdolar(numero);
			if(resultado!=0.0) {
			this.label1.setText("Tienes: "+Double.toString(Math.round(resultado*100.0)/100.0)+" Dolares.");}
		}
		if (OP == "Yen Japones a Dolar") {
			resultado= moneda.yendolar(numero);
			if(resultado!=0.0) {
			this.label1.setText("Tienes: "+Double.toString(Math.round(resultado*100.0)/100.0)+" Dolares.");}
		}
		if (OP == "Won sur-Coreano a Dolar") {
			resultado=moneda.wondolar(numero);
			if(resultado!=0.0) {
			this.label1.setText("Tienes: "+Double.toString(Math.round(resultado*100.0)/100.0)+" Dolares.");}
		}
		if (OP == "Pesos mexicanos a Dolar") {
			resultado= moneda.pesosdolar(numero);
			if(resultado!=0.0) {
			this.label1.setText("Tienes: "+Double.toString(Math.round(resultado*100.0)/100.0)+" Dolares.");}
		}
		temperaturas temp=new temperaturas();
		if (OP == "Centigrados a Farenheit") {
			resultado= temp.cenfar(numero);
			if(resultado!=0.0) {
			this.label1.setText("La temperatura es "+Double.toString(Math.round(resultado*100.0)/100.0)+" Farenheit");}
		}
		if (OP == "Centigrados a Kelvin") {
			resultado= temp.cenkel(numero);
			if(resultado!=0.0) {
			this.label1.setText("La temperatura es "+Double.toString(Math.round(resultado*100.0)/100.0)+" Kelvin");}
		}
		if (OP == "Farenheit a Centigrados") {
			resultado= temp.farcen(numero);
			if(resultado!=0.0) {
			this.label1.setText("La temperatura es "+Double.toString(Math.round(resultado*100.0)/100.0)+" Centigrados");}
		}
		if (OP == "Kelvin a Centigrados") {
			resultado=temp.kelcen(numero);
			if(resultado!=0.0) {
			this.label1.setText("La temperatura es "+Double.toString(Math.round(resultado*100.0)/100.0)+" Centigrados");}
		}
		if (OP == "Farenheit a Kelvin") {
			resultado= temp.farkel(numero);
			if(resultado!=0.0) {
			this.label1.setText("La temperatura es "+Double.toString(Math.round(resultado*100.0)/100.0)+" Kelvin");}
		}
		if (OP == "Kelvin a Farenheit") {
			resultado= temp.kelfar(numero);
			if(resultado!=0.0) {
			this.label1.setText("La temperatura es "+Double.toString(Math.round(resultado*100.0)/100.0)+" Farenheit");}
		}
		if(resultado==0.0) {
			this.label1.setText("Valor no valido");
		}
		
	}

}
