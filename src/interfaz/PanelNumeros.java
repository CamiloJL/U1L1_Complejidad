package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import mundo.Numero;


public class PanelNumeros extends JPanel implements ListSelectionListener{
	
	private InterfazAlgoritmosOrdenamiento interfaz;
	private JList listaNumeros;
	private JScrollPane scroll;

	public PanelNumeros(InterfazAlgoritmosOrdenamiento ven){
		
		interfaz = ven;
		
		setBorder( new TitledBorder( "Numeros Registrados" ) );
		setLayout( new BorderLayout( ) );
		
        listaNumeros = new JList<Numero>( );
        listaNumeros.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
        listaNumeros.addListSelectionListener( this );

        scroll = new JScrollPane( listaNumeros );
        scroll.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        scroll.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        scroll.setBorder( new CompoundBorder( new EmptyBorder( 3, 3, 3, 3 ), new LineBorder( Color.BLACK, 1 ) ) );

        add( scroll, BorderLayout.CENTER );
		
	}

	 public void refrescarLista( ArrayList<Numero> nuevaLista )
	    {
	        listaNumeros.setListData( nuevaLista.toArray( ) );
	        listaNumeros.setSelectedIndex( 0 );
	    }

	 
	    public void seleccionar( int seleccionado )
	    {
	        listaNumeros.setSelectedIndex( seleccionado );
	        listaNumeros.ensureIndexIsVisible( seleccionado );
	    }

	    
	    public void valueChanged( ListSelectionEvent e )
	    {
	        if( listaNumeros.getSelectedValue( ) != null )
	        {
	        	Numero num = ( Numero )listaNumeros.getSelectedValue( );
//	            interfaz.verDatos( program );
	        }
	    }
	
	
}
