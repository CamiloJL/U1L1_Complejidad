package interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelIngresarValores extends JPanel  implements ActionListener{
	
	public final static String AGREGAR = "agregar";
	public final static String ORDENAR = "ordenar";
	
	private InterfazAlgoritmosOrdenamiento interfaz;
	
	private JLabel labNumero;
	private JTextField numero;
	private JButton agregarNumero;
	private JButton ordenarNumeros;
	
	public PanelIngresarValores(InterfazAlgoritmosOrdenamiento ven) {
		
		interfaz = ven;
		
		setLayout(new GridLayout(4,1));
		setBorder( new TitledBorder( "Ingresar Valores" ) );
		
		labNumero = new JLabel("Digíte el número que desea agregar: ");
		numero = new JTextField();
		
		agregarNumero =  new JButton("Agregar número");
		agregarNumero.setActionCommand(AGREGAR);
		agregarNumero.addActionListener(this);
		ordenarNumeros = new JButton("Ordenar");
		ordenarNumeros.setActionCommand(ORDENAR);
		ordenarNumeros.addActionListener(this);
		
		add(labNumero);
		add(numero);
		add(agregarNumero);
		add(ordenarNumeros);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}
