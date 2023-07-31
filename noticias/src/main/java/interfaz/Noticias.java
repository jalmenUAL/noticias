package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticias;

public class Noticias extends VistaNoticias {
	public Vector<Noticias_item> _item = new Vector<Noticias_item>();
	
	VerticalLayout padre;
	public Noticias(VerticalLayout padre) {
		this.padre = padre;
		
		
	}
}