package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasEliminadas extends Noticias {
	
	public Administrador _administrador;
	
	public NoticiasEliminadas(Administrador _administrador) {
		 
		super();
		this._administrador = _administrador;
		this.getOcultar().setVisible(false);
		
		this.getVerdetalle().addClickListener(event->VerDetalle());
		
		NoticiasEliminadas_item n = new NoticiasEliminadas_item(this);
		this.getLista().as(VerticalLayout.class).add(n);
	}



	public void VerDetalle() {
		_verDetalle = new VerDetalle(this);
		_administrador.getContenido().as(VerticalLayout.class).remove(this);
		_administrador.getContenido().as(VerticalLayout.class).add(_verDetalle);
	}
	
	

	
}