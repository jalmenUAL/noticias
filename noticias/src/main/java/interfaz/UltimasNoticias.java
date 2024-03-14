package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class UltimasNoticias extends Noticias {
	 
      Registrado _registrado;
	 

	public UltimasNoticias(Registrado _registrado) {
		 
		super();
		this._registrado = _registrado;
		 
		this.getOcultar().addClickListener(event->Ocultar());
		
		this.getVerdetalle().addClickListener(event->VerDetalle());
		 
		UltimasNoticias_item n = new UltimasNoticias_item(this);
	    this.getLista().as(VerticalLayout.class).add(n);

	}

	 

	public void Ocultar() {
		for (Noticias_item it : _item) {		
			if (((UltimasNoticias_item) it).marcada) { it.setVisible(false);}
		}
	}

	public void VerDetalle() {
		_verDetalle = new VerDetalle(this);
		_registrado.getContenido().as(VerticalLayout.class).remove(this);
		_registrado.getContenido().as(VerticalLayout.class).add(_verDetalle);
	}

}

