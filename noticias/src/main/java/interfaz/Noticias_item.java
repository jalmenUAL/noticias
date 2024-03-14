package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasitem;

public class Noticias_item extends VistaNoticiasitem {
	
	public Noticias _noticias;
	
	public Noticias_item(Noticias _noticias) {
		super();
		this._noticias = _noticias;
		this._noticias._item.add(this);
	}

	
	
}