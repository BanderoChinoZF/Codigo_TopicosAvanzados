import javax.swing.*;

public class ContenedorJFrame2 {
   public ContenedorJFrame2(){
	   JFrame jf = new JFrame ("Ejemplo 2 JFrame");
	   jf.pack(); //  la ventana obtiene el tamaño más pequeño posible que permita ver todos los componentes.
	   jf.setVisible(true);
	   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminar la aplicación al cerrar la ventana
			
			}
		public static void main (String args[]){
			ContenedorJFrame2 jf2 = new ContenedorJFrame2();
		}
   
}