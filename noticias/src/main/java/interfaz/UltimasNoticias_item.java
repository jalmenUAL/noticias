package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class UltimasNoticias_item extends Noticias_item {
	//private event _marcar;

	 
	public UltimasNoticias_item(Noticias padre) {
		super(padre);
		this.getEliminar().setVisible(false);
		 
	}

	public void Marcar() {
		throw new UnsupportedOperationException();
	}
}