// utilizar otro Panel de contenido
import java.awt.FlowLayout; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class EtiquetasEnFrame3 extends JFrame {
	private JLabel etiqueta1 ; // etiqueta con texto
	private JTextField cuadroDeTexto ; // 
	private JButton boton ; // botón aceptar
	private JPanel panel;
	
	public EtiquetasEnFrame3(){
	 	super ("Probando JLabel");
		panel = new JPanel();
		
		
		// crear la etiqueta con un argumento de tipo String
		etiqueta1 = new JLabel ("Mensaje en etiqueta");
		cuadroDeTexto = new JTextField(20);
		boton = new JButton ("Aceptar");	
		cuadroDeTexto.setToolTipText("Ingresa tu nombre");
		panel.add(etiqueta1);  // agregamos la etiqueta1 al JPanel
		panel.add(cuadroDeTexto); //agregamos el cuadro de texto al JPanel
		panel.add(boton); //agregamos el botón al JPanel
        setContentPane(panel);
		
	}
	
	public static void main (String[] args){
		EtiquetasEnFrame3 ef = new EtiquetasEnFrame3();
		ef.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE); //JFrame.DISPOSE_ON_CLOSE, el programa no finaliza, sólo se destruye la ventana
		ef.setSize( 300, 200);
		ef.setVisible( true);
		ef.setLocationRelativeTo(null);
	}
}