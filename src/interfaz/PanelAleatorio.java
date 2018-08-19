package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelAleatorio extends JPanel implements ActionListener{
	
	private InterfazAlgoritmosOrdenamiento interfaz;
	
	public final static String GENERAR_SECUENCIA = "Generar Secuencia";
	public final static String ORDENAR = "Ordenar";
	public final static String ORDENAR_INVERSO = "Orden Inverso";
	public final static String ORDEN_ALEATORIO = "Orden Aleatorio";
	public final static String ORDEN_PORCENTAJE = "Orden porcentual";

	private JLabel cantidad;
	private JTextField txtCantidad;
	private JLabel min;
	private JLabel max;
	private JTextField txtMin;
	private JTextField txtMax;
	private JButton butAleatorio;
	
	private JButton butOrdenar;
	private JButton butOrdenInverso;
	private JButton butOrdenAleatorio;
	private JButton butOrdenPorcentaje;

	public PanelAleatorio(InterfazAlgoritmosOrdenamiento ven) {
		
		interfaz = ven;
		
		setLayout(new FlowLayout());
		setBorder( new TitledBorder( "Generar Aleatorio" ) );

		cantidad = new JLabel("Ingrese la cantidad de números que desea generar:");
		txtCantidad = new JTextField();
		min = new JLabel("Valor mínimo:");
		max = new JLabel("Valor máximo:");
		txtMin = new JTextField();
		txtMax = new JTextField();
		
		butAleatorio = new JButton("Generar Secuencia Aleatoria");
		butAleatorio.addActionListener(this);
		butAleatorio.setActionCommand(GENERAR_SECUENCIA);
		butOrdenar = new JButton("Ordenar");
		butOrdenar.addActionListener(this);
		butOrdenar.setActionCommand(ORDENAR);
		butOrdenInverso = new JButton("Orden Inverso");
		butOrdenInverso.addActionListener(this);
		butOrdenInverso.setActionCommand(ORDENAR_INVERSO);
		butOrdenAleatorio = new JButton("Orden Aleatorio");
		butOrdenAleatorio.addActionListener(this);
		butOrdenAleatorio.setActionCommand(ORDEN_ALEATORIO);
		butOrdenPorcentaje = new JButton("Orden Porcentual");
		butOrdenPorcentaje.addActionListener(this);
		butOrdenPorcentaje.setActionCommand(ORDEN_PORCENTAJE);
		
		
		JPanel panelAux2 = new JPanel();
		panelAux2.setLayout(new GridLayout(2,1));
		panelAux2.add(cantidad);
		panelAux2.add(txtCantidad);
		
		JPanel panelAux3 = new JPanel();
		panelAux3.setLayout(new GridLayout(4,1));
		panelAux3.add(min);
		panelAux3.add(txtMin);
		panelAux3.add(max);
		panelAux3.add(txtMax);
		
		JPanel panelAux1 = new JPanel();
		panelAux1.setLayout(new GridLayout(4,1));
		panelAux1.add(butOrdenar);
		panelAux1.add(butOrdenInverso);
		panelAux1.add(butOrdenAleatorio);
		panelAux1.add(butOrdenPorcentaje);

		JPanel panelAux = new JPanel();
		panelAux.setLayout(new BorderLayout());
		panelAux.add(panelAux2, BorderLayout.NORTH);
		panelAux.add(panelAux3, BorderLayout.CENTER);
		panelAux.add(butAleatorio, BorderLayout.SOUTH);
		
		add(panelAux, BorderLayout.CENTER);
		add(panelAux1, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
