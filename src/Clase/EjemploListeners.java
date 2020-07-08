package Clase;

import javax.swing.*;
import java.awt.event.*;

public class EjemploListeners extends JFrame{
    
    private JPanel panel;
    private JTextField text;
    private JButton button, button2;
	
    public EjemploListeners()
    {
            initComponents();
    }
	
    private void initComponents()
    {
            setSize(300,100);
            setVisible(true);
            text = new JTextField("0",20);
            text.setEditable(false);
            button = new JButton("Pulsa para incrementar");
            button2 = new JButton("Pulsa para decrementar");
            button.addMouseListener(new MyClickListener());
            button2.addMouseListener(new MyClickListener());
            panel = new JPanel();
            panel.add(text);
            panel.add(button);
            panel.add(button2);
            setContentPane(panel);
    }
	
    private class MyClickListener extends MouseAdapter
    {
        private int numClicks;
        private int valor;
        private int resta;
        
        public void mouseClicked(MouseEvent event)
        {
            if(event.getSource()== button)
            {
                numClicks = Integer.parseInt(text.getText());
                numClicks++;
                text.setText(String.valueOf(numClicks));
            }
            else if(event.getSource() == button2)
            {
                valor = Integer.parseInt(text.getText());
                resta = valor -1;
                text.setText(String.valueOf(resta));
                
            }
        }		
    }
    public static void main(String []args) 
    {
            EjemploListeners e1 = new EjemploListeners();	                
    }

}
