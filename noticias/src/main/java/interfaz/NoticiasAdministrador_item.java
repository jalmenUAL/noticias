package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasAdministrador_item extends Noticias_item {
	//private event _eliminar;

	public NoticiasAdministrador_item(Noticias padre) {
		super(padre);
		this.getMarcar().setVisible(false);
		this.getEliminar().addClickListener(event->Eliminar());
	}

	public void Eliminar() {
		throw new UnsupportedOperationException();
	}
}