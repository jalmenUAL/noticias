   package interfaz;

import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasAdministrador_item extends Noticias_item {
	//private event _eliminar;

	public NoticiasAdministrador_item(NoticiasAdministrador padre) {
		super(padre);
		this.getMarcar().setVisible(false);
		this.getEliminar().addClickListener(event->Eliminar());
		this.getBajar().addClickListener(event->Bajar());
		this.getSubir().addClickListener(event->Subir());
	}

	public void Eliminar() {
		this._noticias.getLista().as(VerticalLayout.class).remove(this);
		 this._noticias._item.remove(this);
	}
	
	public void Subir() {
		 
		 Integer i = this._noticias._item.indexOf(this);
		 Noticias_item anterior = this._noticias._item.get(i-1);
		 this._noticias._item.insertElementAt(this, i-1);
		 this._noticias._item.insertElementAt(anterior, i);
		 this._noticias.load();
		  
	}
	public void Bajar() {
		Integer i = this._noticias._item.indexOf(this);
		 Noticias_item posterior = this._noticias._item.get(i+1);
		 this._noticias._item.insertElementAt(this, i+1);
		 this._noticias._item.insertElementAt(posterior, i);
		 this._noticias.load();
		
	}
}