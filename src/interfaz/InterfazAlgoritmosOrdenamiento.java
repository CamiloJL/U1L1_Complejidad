package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfazAlgoritmosOrdenamiento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelNumeros panelNumeros;
	private PanelAleatorio panelAleatorio;
	private PanelIngresarValores panelValores;

	public InterfazAlgoritmosOrdenamiento() {
		setLayout(new BorderLayout());
		setSize(1200, 400);
		setVisible(true);
		setTitle("Ordenamiento de Números Arbitrariamente Grandes");
		
		panelNumeros = new PanelNumeros(this);
		panelAleatorio = new PanelAleatorio(this);
		panelValores = new PanelIngresarValores(this);
		
		JPanel panelAux = new JPanel();
		panelAux.setLayout(new BorderLayout());
		
		this.add(panelNumeros, BorderLayout.CENTER);
		panelAux.add(panelValores, BorderLayout.NORTH);
		panelAux.add(panelAleatorio, BorderLayout.CENTER);
		this.add(panelAux, BorderLayout.EAST);
		
		
	}

	public static void main(String args[]) {
		InterfazAlgoritmosOrdenamiento aplicacion = new InterfazAlgoritmosOrdenamiento();
		aplicacion.setVisible(true);
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
