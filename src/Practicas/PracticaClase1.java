/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JTextField;

public class PracticaClase1 extends JFrame {
	
	
	public PracticaClase1()
	{
                            super();
                            configurarVentana();
                            initComponent();
	}
	
	public void configurarVentana()
	{
            this.setTitle("Elecciones...");                         // colocamos titulo a la ventana
            this.setSize(830, 800);                                 // colocamos tamanio a la ventana (ancho, alto)
            this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
            this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
            this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
	}
	
	public void initComponent()
	{
            //Inicializamos nuestras variables.
            JPanel panelFuentes, panel1, panel2, panel3, panelPresupuesto, panelTotales;
            JButton button1, button2, button3, button4;
            JLabel label1a, label2a, label3a;
            JLabel label1b, label2b, label3b;
            JLabel label1c, label2c, label3c;
            JLabel labelp1, labelp2, labelp3;
            JLabel labelt1, labelt2;
            JTextField jTextFieldt1, jTextFieldt2;

            JProgressBar progressBar1, progressBar2, progressBar3;
            JCheckBox checkBox1,checkBox2,checkBox3;


            //Creamos nuestros commponentes.
            panelFuentes = new JPanel();
                    checkBox1 = new JCheckBox("Publicidad por Radio.");
                    checkBox2 = new JCheckBox("Publicidad por Prensa.");
                    checkBox3 = new JCheckBox("Publicidad por Television.");
//----------------------------------------------------------------------------------------------------------------------------		
            panel1 = new JPanel();
                    label1a = new JLabel();
                    button1 = new JButton("V O T A R");
                    label2a = new JLabel("2", SwingConstants.CENTER);
                    label3a = new JLabel("18.2%", SwingConstants.CENTER);
                    progressBar1 = new JProgressBar();
//----------------------------------------------------------------------------------------------------------------------------				
            panel2 = new JPanel();
                    label1b = new JLabel();
                    button2 = new JButton("V O T A R");
                    label2b = new JLabel("3", SwingConstants.CENTER);
                    label3b = new JLabel("27.3%", SwingConstants.CENTER);
                    progressBar2 = new JProgressBar();
//----------------------------------------------------------------------------------------------------------------------------				
            panel3 = new JPanel();
                    label1c = new JLabel();
                    button3 = new JButton("V O T A R");
                    label2c = new JLabel("6", SwingConstants.CENTER);
                    label3c = new JLabel("54.5%", SwingConstants.CENTER);
                    progressBar3 = new JProgressBar();
//----------------------------------------------------------------------------------------------------------------------------
            panelPresupuesto = new JPanel();
                    labelp1 = new JLabel("200", SwingConstants.CENTER);
                    labelp2 = new JLabel("600", SwingConstants.CENTER);
                    labelp3 = new JLabel("2000", SwingConstants.CENTER);
//----------------------------------------------------------------------------------------------------------------------------
            panelTotales = new JPanel();
                    labelt1 = new JLabel("Votos", SwingConstants.LEFT);
                    labelt2 = new JLabel("Presupuesto", SwingConstants.LEFT);
                    jTextFieldt1 = new JTextField("11",SwingConstants.RIGHT);
                    jTextFieldt2 = new JTextField("2800",SwingConstants.RIGHT);
                    button4 = new JButton("Reiniciar");
//----------------------------------------------------------------------------------------------------------------------------
            //panelFuentes...
            panelFuentes.setLayout(new GridLayout(1,1,20,20));
            //panelFuentes.setBackground(Color.CYAN);
            panelFuentes.setBorder(BorderFactory.createTitledBorder("Indique la fuente de informacion."));
            panelFuentes.setToolTipText("Por favor seleccione una opcion.");
            panelFuentes.setBounds(20, 20, 790, 50);

            //Agregamos los componentes al panelFuentes
            panelFuentes.add(checkBox1);
            panelFuentes.add(checkBox2);
            panelFuentes.add(checkBox3);
//----------------------------------------------------------------------------------------------------------------------------
                    //panel1.... ---> Es el primer panel de las imagenes.
                    panel1.setLayout(null);
                    //panel1.setBackground(Color.WHITE);
                    panel1.setToolTipText("Por favor pulse el boton Votar");
                    panel1.setBorder(BorderFactory.createLineBorder(Color.black));
                    panel1.setBounds(20, 90, 250, 420);

                    Icon peje = new ImageIcon(getClass().getResource("pejeShidote.jpg"));
                    label1a = new JLabel(peje);
                    label1a.setBorder(BorderFactory.createLineBorder(Color.black));
                    label1a.setBounds(15,15,220,220);

                    button1.setBounds(15,245,220,30);

                    label2a.setBorder(BorderFactory.createLineBorder(Color.black));
                    label2a.setBounds(15,285,220,30);

                    label3a.setBorder(BorderFactory.createLineBorder(Color.black));
                    label3a.setBounds(15, 325, 220, 30);

                    progressBar1.setMaximum(100);
                    progressBar1.setValue(18);
                    progressBar1.setBounds(15,365,220,30);

                    panel1.add(label1a);
                    panel1.add(button1);
                    panel1.add(label2a);
                    panel1.add(label3a);
                    panel1.add(progressBar1);
//----------------------------------------------------------------------------------------------------------------------------
                    //panel2.... ---> Es el segundo panel de las imagenes.
                    panel2.setLayout(null);
                    //panel2.setBackground(Color.GRAY);
                    panel2.setToolTipText("Por favor pulse el boton Votar");
                    panel2.setBorder(BorderFactory.createLineBorder(Color.black));
                    panel2.setBounds(290, 90, 250, 420);

                    Icon anaya = new ImageIcon(getClass().getResource("anayaShidote.jpg"));
                    label1b = new JLabel(anaya);
                    label1b.setBorder(BorderFactory.createLineBorder(Color.black));
                    label1b.setBounds(15,15,220,220);

                    button2.setBounds(15,245,220,30);

                    label2b.setBorder(BorderFactory.createLineBorder(Color.black));
                    label2b.setBounds(15,285,220,30);

                    label3b.setBorder(BorderFactory.createLineBorder(Color.black));
                    label3b.setBounds(15, 325, 220, 30);

                    progressBar2.setMaximum(100);
                    progressBar2.setValue(27);
                    progressBar2.setBounds(15,365,220,30);

                    panel2.add(label1b);
                    panel2.add(button2);
                    panel2.add(label2b);
                    panel2.add(label3b);
                    panel2.add(progressBar2);
//----------------------------------------------------------------------------------------------------------------------------	
                    //panel3.... ---> Es el tercer panel de las imagenes.
                    panel3.setLayout(null);
                    //panel3.setBackground(Color.GREEN);
                    panel3.setBorder(BorderFactory.createLineBorder(Color.black));
                    panel3.setToolTipText("Por favor pulse el boton Votar");
                    panel3.setBounds(560, 90, 250, 420);

                    Icon meade = new ImageIcon(getClass().getResource("meadeShidote.jpg"));
                    label1c = new JLabel(meade);
                    label1c.setBorder(BorderFactory.createLineBorder(Color.black));
                    label1c.setBounds(15,15,220,220);

                    button3.setBounds(15,245,220,30);

                    label2c.setBorder(BorderFactory.createLineBorder(Color.black));
                    label2c.setBounds(15,285,220,30);

                    label3c.setBorder(BorderFactory.createLineBorder(Color.black));
                    label3c.setBounds(15, 325, 220, 30);

                    progressBar3.setMaximum(100);
                    progressBar3.setValue(27);
                    progressBar3.setBounds(15,365,220,30);

                    panel3.add(label1c);
                    panel3.add(button3);
                    panel3.add(label2c);
                    panel3.add(label3c);
                    panel3.add(progressBar3);
//--------------------------------------------------------------------------------------------------------------------------
            //Datos de nuestro panel presupuestos.
            panelPresupuesto.setLayout(new GridLayout(1,1,20,20));
            //panelPresupuesto.setBackground(Color.YELLOW);
            panelPresupuesto.setBorder(BorderFactory.createTitledBorder("Presupuesto"));
            panelPresupuesto.setBounds(20, 530, 790, 50);

            labelp1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelp2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelp3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            //Agregamos los componentes al panelPresupuesto
            panelPresupuesto.add(labelp1);
            panelPresupuesto.add(labelp2);
            panelPresupuesto.add(labelp3);
//--------------------------------------------------------------------------------------------------------------------------
        //Datos de nuestro panel Totales.
        panelTotales.setLayout(null);
        //panelTotales.setBackground(Color.ORANGE);
        panelTotales.setBorder(BorderFactory.createTitledBorder("Totales"));
        panelTotales.setBounds(20, 600, 790, 100);

        labelt1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        labelt1.setBounds(20, 25, 220, 25);

        labelt2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        labelt2.setBounds(20, 60, 220, 25);

        jTextFieldt1.setBounds(260, 25, 220, 25);
        jTextFieldt1.setHorizontalAlignment(JTextField.RIGHT);
        jTextFieldt1.enable(false);

        jTextFieldt2.setBounds(260, 60, 220, 25);
        jTextFieldt2.setHorizontalAlignment(JTextField.RIGHT);
        jTextFieldt2.enable(false);

        button4.setBounds(550, 33, 180, 40);


        panelTotales.add(labelt1);
        panelTotales.add(labelt2);
        panelTotales.add(jTextFieldt1);
        panelTotales.add(jTextFieldt2);
        panelTotales.add(button4);
//--------------------------------------------------------------------------------------------------------------------------

        //Agregamos a nuestro JFrame.
        this.add(panelFuentes);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panelPresupuesto);
        this.add(panelTotales);
		
	}
	
	public static void main(String []args)
	{
		PracticaClase1 pc1 = new PracticaClase1();	
		pc1.setVisible(true);
	}

}