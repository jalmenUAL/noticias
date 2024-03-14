package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPublicarnoticia;

public class PublicarNoticia extends VistaPublicarnoticia {
	
	public Administrador _administrador;
	
	public PublicarNoticia(Administrador _administrador) {
		super();
		this._administrador = _administrador;
		this.getPublicar().addClickListener(event->Publicar());
		
	}
	
	public void Publicar() {	
		this._administrador.getContenido().as(VerticalLayout.class).remove(this);		
	}

	
}