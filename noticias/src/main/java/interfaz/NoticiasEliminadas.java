package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasEliminadas extends Noticias {
	public NoticiasEliminadas(Administrador _administrador) {
		super();
		this._administrador = _administrador;
		this.getOcultar().setVisible(false);
	}



	
	
	

	public Administrador _administrador;
}