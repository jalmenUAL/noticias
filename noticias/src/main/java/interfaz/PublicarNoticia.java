package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPublicarnoticia;

public class PublicarNoticia extends VistaPublicarnoticia {
	public PublicarNoticia(Administrador _administrador) {
		super();
		this._administrador = _administrador;
		
	    //NO ESTÁ EN EL DIAGRAMA DE CASOS DE USO
		this.getPublicar().addClickListener(event->Publicar());
		
	}
	
	//NO ES GENERADO POR EL PLUGIN
	public void Publicar() {
		
		this._administrador.getContenido().as(VerticalLayout.class).remove(this);
		
		
	}

	public Administrador _administrador;
}