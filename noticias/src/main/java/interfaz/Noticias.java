package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import noticias.MainView;
import vistas.VistaNoticias;

public class Noticias extends VistaNoticias {
	public Vector<Noticias_item> _item = new Vector<Noticias_item>();
	public VerDetalle _verDetalle;
	public printer _printer;
	 
	public Noticias() {
		super();
		this.getImprimir().addClickListener(event->imprimir(null));
	}

	public void imprimir(Noticias_item noticia_item) {
		_printer = new printer();
		_printer.imprimir(noticia_item);
	}
	 
}