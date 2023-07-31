package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasitem;

public class Noticias_item extends VistaNoticiasitem {
	public Noticias_item(Noticias _noticias) {
		super();
		this._noticias = _noticias;
	}

	public Noticias _noticias;
	public VerDetalle _verDetalle;
	public printer _printer;

	public void VerDetalle() {
		throw new UnsupportedOperationException();
	}

	public void imprimir() {
		throw new UnsupportedOperationException();
	}
}