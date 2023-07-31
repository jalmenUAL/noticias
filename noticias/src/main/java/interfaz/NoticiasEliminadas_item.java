package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasEliminadas_item extends Noticias_item {

	public NoticiasEliminadas_item(Noticias padre) {
		super(padre);
		this.getMarcar().setVisible(false);
		this.getEliminar().setVisible(false);
		 
	}
}