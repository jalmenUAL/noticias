package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasAdministrador extends Noticias {
	public NoticiasAdministrador(VerticalLayout padre) {
		super(padre);
		this.getOcultar().setVisible(false);
	}

	public Administrador _administrador;
}