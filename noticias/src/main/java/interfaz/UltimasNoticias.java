package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class UltimasNoticias extends Noticias {
	 

	 

	public UltimasNoticias(Registrado _registrado) {
		//EL SUPER SE AÑADE A MANO
		super(_registrado);
		this._registrado = _registrado;
		
		this.getOcultar().addClickListener(event->Ocultar());
		
		//Una noticia añadida a mano de prueba
		UltimasNoticias_item n = new UltimasNoticias_item(this);
	    this.getLista().as(VerticalLayout.class).add(n);

	}

	//private event _ocultar;
	public Registrado _registrado;

	public void Ocultar() {
		for (Noticias_item it : _item) {		
			if (((UltimasNoticias_item) it).marcada) { it.setVisible(false);}
		}
	}
}