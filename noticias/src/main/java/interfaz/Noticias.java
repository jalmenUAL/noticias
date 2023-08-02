package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dialog.Dialog;
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
		
		this.getVerdetalle().addClickListener(event->VerDetalle());
		this.getImprimir().addClickListener(event->imprimir());
	}

	
	public VerDetalle _verDetalle;
	public printer _printer;

	public void VerDetalle() {
		_verDetalle = new VerDetalle(this);
		
		Dialog dialog = new Dialog();
		dialog.setModal(false);
		dialog.setDraggable(true);
		dialog.add(_verDetalle);
		
		dialog.open();
	}

	public void imprimir() {
		_printer = new printer();
		_printer.imprimir();
	}
	 
}