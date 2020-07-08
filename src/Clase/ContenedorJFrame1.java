import javax.swing.*;

public class ContenedorJFrame1 extends JFrame{

		public ContenedorJFrame1(){
			super("Ejemplo 1 JFrame");
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE); // Terminar la aplicación al cerrar la ventana
			
			}
		public static void main (String args[]){
			ContenedorJFrame1 jf1 = new ContenedorJFrame1();
		}
	}