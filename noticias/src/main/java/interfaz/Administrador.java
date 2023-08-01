package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Administrador extends Logueado {
	
	public NoticiasEliminadas _noticiasEliminadas;
	public NoticiasAdministrador _noticiasAdministrador;
	public PublicarNoticia _publicarNoticia;
	
	public Administrador(noticias.MainView MainView) {
		super(MainView);
		this.getUltimasnoticias().setVisible(false);
	    this.getVeractividad().setVisible(false);
	}

	

	public void NoticiasEliminadas() {
		_noticiasEliminadas = new NoticiasEliminadas(this);
		this.getContenido().as(VerticalLayout.class).add(_noticiasEliminadas);
		
	}

	public void NoticiasAdministrador() {
		_noticiasAdministrador = new NoticiasAdministrador(this);
		this.getContenido().as(VerticalLayout.class).add(_noticiasAdministrador);
	}

	public void PublicarNoticia() {
		_publicarNoticia = new PublicarNoticia(this);
		this.getContenido().as(VerticalLayout.class).add(_publicarNoticia);
	}
}