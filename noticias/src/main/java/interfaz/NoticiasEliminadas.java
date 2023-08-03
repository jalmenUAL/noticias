package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasEliminadas extends Noticias {
	public NoticiasEliminadas(Administrador _administrador) {
		//EL SUPER SE AÑADE A MANO
		super(_administrador);
		this._administrador = _administrador;
		this.getOcultar().setVisible(false);
		
		
		//Una noticia añadida a mano de prueba
		
		NoticiasEliminadas_item n = new NoticiasEliminadas_item(this);
		this.getLista().as(VerticalLayout.class).add(n);
	}



	
	
	

	public Administrador _administrador;
}