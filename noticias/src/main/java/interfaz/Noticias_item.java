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
		_verDetalle = new VerDetalle(this);
		this._noticias.logueado.getContenido().as(VerticalLayout.class).add(_verDetalle);
	}

	public void imprimir() {
		_printer = new printer();
		_printer.imprimir();
	}
}