package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasAdministrador extends Noticias {
	 
	
	

	public NoticiasAdministrador(Administrador _administrador) {
		//EL SUPER SE AÑADE A MANO
		super(_administrador);
		this._administrador = _administrador;
		this.getOcultar().setVisible(false);
		
		//Una noticia añadida a mano de prueba
		
		NoticiasAdministrador_item n = new NoticiasAdministrador_item(this);
		this.getLista().as(VerticalLayout.class).add(n);
	}



	public Administrador _administrador;
}