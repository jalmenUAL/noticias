package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import noticias.MainView;
import vistas.VistaNoticias;

public class Noticias extends VistaNoticias {
	public Vector<Noticias_item> _item = new Vector<Noticias_item>();
	
	//AQUÍ HAY QUE AÑADIR EL LOGUEADO A MANO
	Logueado logueado;

	public Noticias(Logueado logueado) {
		super();
		this.logueado = logueado;
	}

	 
}