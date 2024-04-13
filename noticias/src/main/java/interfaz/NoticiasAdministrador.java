package interfaz;

import java.util.HashMap;
import java.util.Map;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasAdministrador extends Noticias {
	
	public Administrador _administrador;
	 
	
	public NoticiasAdministrador(Administrador _administrador) {
		 
		super();
		this._administrador = _administrador;
		this.getOcultar().setVisible(false);
	
		this.getVerdetalle().addClickListener(event->VerDetalle());
		NoticiasAdministrador_item n = new NoticiasAdministrador_item(this);
		n.getTexto().setText("primera");
		NoticiasAdministrador_item n1 = new NoticiasAdministrador_item(this);
		n1.getTexto().setText("segunda");
		NoticiasAdministrador_item n2 = new NoticiasAdministrador_item(this);
		n2.getTexto().setText("tercera");
		NoticiasAdministrador_item n3 = new NoticiasAdministrador_item(this);
		n3.getTexto().setText("cuarta");
		this._item.add(n);
		this._item.add(n1);
		this._item.add(n2);
		this._item.add(n3);
		load();
		_administrador.getContenido().as(VerticalLayout.class).removeAll();
		_administrador.getContenido().as(VerticalLayout.class).add(this);
	}


    
	
	
	public void VerDetalle() {
		_verDetalle = new VerDetalle(this);
		_administrador.getContenido().as(VerticalLayout.class).remove(this);
		_administrador.getContenido().as(VerticalLayout.class).add(_verDetalle);
	}
}