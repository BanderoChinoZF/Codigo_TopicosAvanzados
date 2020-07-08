package Practicas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Practica_2 extends JFrame{
	
private JPanel panel1;
private JButton btn1, btn2, limpiar;
private JTextField txtf1, txtf2, txtf3, textR;

    public Practica_2()
    {
        initcomponents();
    }

    private void initcomponents()
    {
            setTitle("Suma y Resta");                         
            setSize(450, 230);                                 
            setLocationRelativeTo(null);                       
            //setLayout(null);                                   
            setResizable(false);                               
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

            panel1 = new JPanel();
            panel1.setLayout(null);
            panel1.setBackground(Color.DARK_GRAY);

            txtf1 = new JTextField();
            //txtf1.setText();
            //txtf1.setEditable(false);
            txtf1.setHorizontalAlignment(JTextField.RIGHT);
            txtf1.setBounds(20,10,200,30);

            txtf2 = new JTextField();
            //txtf2.setEditable(false);
            txtf2.setHorizontalAlignment(JTextField.LEFT);
            //txtf2.setText();
            txtf2.setBounds(230,10,200,30);

            btn1 = new JButton();
            btn1.setText("Sumar");
            btn1.setBounds(120,60,100,30);
            btn1.addMouseListener(new MyClickListener());

            btn2 = new JButton();
            btn2.setText("Restar");
            btn2.setBounds(230, 60, 100, 30);
            btn2.addMouseListener(new MyClickListener());

            txtf3 = new JTextField();
            txtf3.setEditable(false);
            txtf3.setText("El Resultado de la Operacion es: ");
            txtf3.setBounds(20,110,200,30);

            textR = new JTextField();
            textR.setText("0");
            textR.setEditable(false);
            textR.setBounds(230,110,50,30);

            limpiar = new JButton();
            limpiar.setText("Limpiar");
            limpiar.setBounds(170,150,100,30);
            limpiar.addMouseListener(new MyClickListener());

		
            panel1.add(txtf1);
            panel1.add(txtf2);
            panel1.add(btn1);
            panel1.add(btn2);
            panel1.add(txtf3);
            panel1.add(textR);  
            panel1.add(limpiar);

            add(panel1);		
    }
	
    
    private class MyClickListener extends MouseAdapter
    {
            private int valorA;
            private int valorB;
            private int resultado;

            @Override
    public void mouseClicked(MouseEvent event)
    {
                if(event.getSource()== btn1)
                {
                    valorA = Integer.parseInt(txtf1.getText());
                    valorB = Integer.parseInt(txtf2.getText());

                    resultado = valorA + valorB;

                    textR.setText(String.valueOf(resultado));
                }
                else if(event.getSource() == btn2)
                {
                    valorA = Integer.parseInt(txtf1.getText());
                    valorB = Integer.parseInt(txtf2.getText());

                    resultado = (valorA) - (valorB);
                    textR.setText(String.valueOf(resultado));
                }
                else if(event.getSource() == limpiar)
                {
                    txtf1.setText("");
                    txtf2.setText("");
                }
            }
    }
        
    public static void main(String []args)
    {
        Practica_2 p2 = new Practica_2();
        p2.setVisible(true);
    }
}