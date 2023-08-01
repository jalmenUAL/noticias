package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class UltimasNoticias_item extends Noticias_item {
	//private event _marcar;

	//PUESTO A MANO
	public Boolean marcada = false;
	 
	public UltimasNoticias_item(Noticias padre) {
		super(padre);
		this.getEliminar().setVisible(false);
		 
	}

	public void Marcar() {
		this.getTexto().getStyle().set("colour", "blue");
		marcada = true;
	}
}