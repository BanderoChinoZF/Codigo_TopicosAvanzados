import java.awt.FlowLayout; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class EtiquetasEnFrame extends JFrame {
	private JLabel etiqueta1 ; // etiqueta con texto
	private JLabel etiqueta2 ; // etiqueta creada con texto e icono
	private JLabel etiqueta3 ; // etiqueta con texto e icono agregado
	
	public EtiquetasEnFrame(){
	 	super ("Probando JLabel");
		setLayout(new FlowLayout()); // El predeterminado es BorderLayout
		
		// crear la etiqueta con un argumento de tipo String
		etiqueta1 = new JLabel ("Etiqueta 1 con texto");
		etiqueta1.setToolTipText("Esta es la etiqueta 1");
		add(etiqueta1);  // agregamos la etiqueta1 al JFrame
		
		// crear la etiqueta con cadena, ícono y alineación
		Icon telefono = new ImageIcon(getClass().getResource("mobile-phone.png"));
		etiqueta2 = new JLabel("Etiqueta con texto e icono", telefono, SwingConstants.LEFT);
		etiqueta2.setToolTipText("Esta es la etiqueta 2");
		add(etiqueta2); 
		
		etiqueta3 = new JLabel();
		etiqueta3.setText( "Etiqueta con icono y texto en botón");
		etiqueta3.setIcon(telefono);
		etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
		etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
		etiqueta3.setToolTipText("Esta es la etiqueta 3");
		add(etiqueta3);
		
		setLocationRelativeTo(null);
	}
}