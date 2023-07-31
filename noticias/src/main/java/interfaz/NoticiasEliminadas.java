package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasEliminadas extends Noticias {
	public NoticiasEliminadas(VerticalLayout padre) {
		super(padre);
		this.getOcultar().setVisible(false);
	}

	public Administrador _administrador;
}