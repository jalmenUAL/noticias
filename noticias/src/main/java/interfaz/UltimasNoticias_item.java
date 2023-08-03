package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class UltimasNoticias_item extends Noticias_item {
	//private event _marcar;

	//PUESTO A MANO PARA SABER SI ESTÁ MARCADA O NO
	Boolean marcada = false;
	 
	public UltimasNoticias_item(Noticias padre) {
		super(padre);
		this.getEliminar().setVisible(false);
		this.getMarcar().addClickListener(event->Marcar());
		 
	}

	public void Marcar() {
		marcada = true;
		this.getTexto().getStyle().set("background-color","gray");
		this._noticias.getOcultar().addClickListener(event->this._noticias._item.remove(this));
	}
}