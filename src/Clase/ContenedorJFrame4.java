// agregar componentes en JFrame con herencia, sin container
import javax.swing.*;
import java.awt.*;

public class ContenedorJFrame4 extends JFrame{
	private JButton miBoton1;
	
	public ContenedorJFrame4 (){
		super("Ejemplo JFrame4 componentes sin contenedor");
		miBoton1 = new JButton("Boton 1 sin contenedor");
		add(miBoton1);
		setSize(200,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		ContenedorJFrame4 miFrame = new ContenedorJFrame4();
	}
}