package Clase;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class VentanaPrincipal2 extends JFrame {

    private JMenuBar barraMenu;   
    private JMenu menuVer,menuEdicion,menuAyuda,menuHistorial;
    private JMenuItem itmEstandar, itmCientifica, 
		itmCopiar, itmPegar, itmHistorialCopiar, 
			itmHistorialEditar, itmHistorialCancelar, 
				itmHistorialBorrar, itmAyudaVer, 
					itmAyudaAcerca;
	private JLabel etiqueta1 ; // etiqueta con texto
	private JTextField cuadroDeTexto ; // 
	private JButton boton ; // botón aceptar
	private Container panel ;
     
    /* Constructor Por Defecto */
    public VentanaPrincipal2() {
        /* con el super llamo al constructor del Padre y le paso el titulo de la ventana */
        super("Ejemplo JMenuBar");
		panel = getContentPane();
		panel.setLayout(new FlowLayout());
        /* Inicializo todos los componentes de la ventana */
        barraMenu          = new JMenuBar();
         
        menuVer            = new JMenu("Ver");
        menuEdicion        = new JMenu("Editar");
        menuAyuda          = new JMenu("Ayuda");
        menuHistorial      = new JMenu("Historial");
         
        itmEstandar        = new JMenuItem("Estandar");
        itmCientifica      = new JMenuItem("Cientifica");
         
        itmCopiar          = new JMenuItem("Copiar");
        itmPegar           = new JMenuItem("Pegar");
         
        itmHistorialCopiar = new JMenuItem("Copiar Historial");
        itmHistorialEditar = new JMenuItem("Editar");
        itmHistorialCancelar=new JMenuItem("Cancelar Edición");
        itmHistorialBorrar = new JMenuItem("Borrar");
        itmAyudaVer        = new JMenuItem("Ver La Ayuda");
        itmAyudaAcerca     = new JMenuItem("Acerca de Calculadora");

        /* dimensiones a la ventana */
        setSize(250,300);
     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        /*  Agregar los JMenu al JMenuBar y los JMenuItem a los JMenu */
         
        /* Agregar el JMenu "Ver" a la Barra de Menu */
        barraMenu.add(menuVer);
            /* 
            Ahora al JMenu "Ver" Agrego dos JMenuItem 
            Deberia quedar Mas o menos asi:
                    [ Ver ► ]
                        |__ Estandar
                        |__ Científica
            */
            menuVer.add(itmEstandar);
            menuVer.add(itmCientifica);
        /* Ahora es el turno del JMenu "Edicion" agregarse a la barra de menu */
        barraMenu.add(menuEdicion);
            /* 
                Al JMenu "Edición" le agrego 2 JMenuItem y 1 JMenu
                Deberia quedar Mas o menos asi:
                    [ Edicion ► ]
                        |__ Copiar
                        |__ Pegar
                        |__ [ Historial ► ]
             */
            menuEdicion.add(itmCopiar);
            menuEdicion.add(itmPegar);
            menuEdicion.add( menuHistorial);
                /* 
                    Al JMenu Historial (que esta dentro del JMenu Editar) 
                    le agrego los Items 
                    [ Edicion ► ]
                        |__ Copiar
                        |__ Pegar
                        |__ [ Historial ► ]
                                    |__ Copiar
                                    |__ Editar
                                    |__ Cancelar
                                    |__ Borrar
                 */
                 menuHistorial.add( itmHistorialCopiar);
                 menuHistorial.add( itmHistorialEditar);
                 menuHistorial.add( itmHistorialCancelar);
                 menuHistorial.add( itmHistorialBorrar);
        /* Por ultimo Agrego el JMenu Ayuda a la barra */
         barraMenu.add( menuAyuda);
            /* 
                 A ese JMenu le agrego los items que tendrá
                    [ Ayuda ► ]
                        |__ Ver
                        |__ Acerca de Calculadora
             */
             menuAyuda.add( itmAyudaVer);
             menuAyuda.add( itmAyudaAcerca);
             
             
      
		
		// agregar componentes a JFrame
		etiqueta1 = new JLabel ("Mensaje en etiqueta");
		cuadroDeTexto = new JTextField(20);
		boton = new JButton ("Aceptar");	
		cuadroDeTexto.setToolTipText("Ingresa tu nombre");
		panel.add(etiqueta1);  // agregamos la etiqueta1 al JFrame
		panel.add(cuadroDeTexto); //agregamos el cuadro de texto al JFrame
		panel.add(boton); //agregamos el botón al JFrame
                
    ActionListener ejemploA = new ActionListener()
    {
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null,"Presionaste el item acerca de");
	}
    };

    this.itmAyudaAcerca.addActionListener(ejemploA);
    
        /* Por último le seteo el JMenuBar a esta ventana */
        setJMenuBar( barraMenu);
        setLocationRelativeTo(null);
        setVisible(true);
 
    }
     

	
	public static void main (String[] args){
		VentanaPrincipal2 vp = new VentanaPrincipal2();
	}
}