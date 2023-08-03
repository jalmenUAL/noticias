package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasitem;

public class Noticias_item extends VistaNoticiasitem {
	public Noticias_item(Noticias _noticias) {
		super();
		this._noticias = _noticias;
		
		//Si añade al vector de noticias
		
		this._noticias._item.add(this);
	}

	public Noticias _noticias;
	
}