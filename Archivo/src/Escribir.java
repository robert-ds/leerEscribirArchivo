import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.w3c.dom.DocumentFragment;

public class Escribir extends JFrame implements ActionListener{

	JTextField entrada;
	File archivo;
	JButton boton;
	
	public Escribir(){
		entrada = new JTextField("Escribe");
		boton = new JButton("Guardar");
		add(entrada);
		add(boton);
		boton.addActionListener(this);
		
		Container contenedor = getContentPane();
		contenedor.add(entrada, BorderLayout.NORTH);
		
		setSize(400, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] arg){
		Escribir write = new Escribir();
		write.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String text = entrada.getText();
		
		if(e.getSource() == boton){
			File archivo = new File("C:\\Users\\Robert\\Desktop\\archivoJava.txt"); 
			
			try{
				FileWriter writer = new FileWriter(archivo);
				
				PrintWriter escribir = new PrintWriter(writer);
				escribir.append("Hola");
				escribir.println();
				escribir.append(text);
				escribir.close();
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
		
	}
	
}
