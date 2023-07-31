package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerdetalle;

public class VerDetalle extends VistaVerdetalle {
	public VerDetalle(Noticias_item _noticias) {
		super();
		this._noticias = _noticias;
	}
	public Noticias_item _noticias;
	public Vector<VerDetalle_item> _item = new Vector<VerDetalle_item>();
	

}