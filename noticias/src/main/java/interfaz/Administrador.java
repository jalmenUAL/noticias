package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Administrador extends Logueado {
	
	public NoticiasEliminadas _noticiasEliminadas;
	public NoticiasAdministrador _noticiasAdministrador;
	public PublicarNoticia _publicarNoticia;
	
	public Administrador(VerticalLayout MainView) {
		super(MainView);
		this.getUltimasnoticias().setVisible(false);
	    this.getVeractividad().setVisible(false);
	}

	

	public void NoticiasEliminadas() {
		throw new UnsupportedOperationException();
	}

	public void NoticiasAdministrador() {
		throw new UnsupportedOperationException();
	}

	public void PublicarNoticia() {
		throw new UnsupportedOperationException();
	}
}