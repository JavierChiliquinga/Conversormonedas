package conversor;

import javax.swing.JFrame;

public class conversor {
public static void main(String[] args) {
	//inicio la pestaña inicial
	inicial inicio1=new inicial();
	//ubicacion y tamano
    inicio1.setBounds(0,0,300,180);
    //activo la pestana
    inicio1.setVisible(true);
    //agrego titulo a la pestana
    inicio1.setTitle("Menu");
    inicio1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
