package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoticiasAdministrador extends Noticias {
	 
	
	

	public NoticiasAdministrador(Administrador _administrador) {
		//EL SUPER SE AÑADE A MANO
		super(_administrador);
		this._administrador = _administrador;
		this.getOcultar().setVisible(false);
	}



	public Administrador _administrador;
}