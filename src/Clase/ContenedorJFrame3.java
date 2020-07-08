import javax.swing.*;
import java.awt.*;
// agregar componentes en el panel (contenedor) del JFrame
public class ContenedorJFrame3 extends JFrame{
	private Container panelFrame;
	private JButton miBoton1;
	
	public ContenedorJFrame3 (){
		super("Ejemplo JFrame3 componentes en contenedor");
		miBoton1 = new JButton("Boton 1");

		panelFrame = getContentPane();
		panelFrame.add(miBoton1);

		setSize(200,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		ContenedorJFrame3 miFrame = new ContenedorJFrame3();
	}
}