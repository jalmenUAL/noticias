package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Administrador extends Logueado {
	
	public NoticiasEliminadas _noticiasEliminadas;
	public NoticiasAdministrador _noticiasAdministrador;
	public PublicarNoticia _publicarNoticia;
	public VerRegistrados _verRegistrados;


	
	public Administrador(noticias.MainView MainView) {
		super(MainView);
		this.getUltimasnoticias().setVisible(false);
	    this.getVeractividad().setVisible(false);
	    
	    this.getNoticiaseliminadas().addClickListener(event->NoticiasEliminadas());
	    this.getNoticiasadministrador().addClickListener(event->NoticiasAdministrador());
	    this.getPublicarnoticia().addClickListener(event->PublicarNoticia());
	    this.getVerregistrados().addClickListener(event->VerRegistrados());
	    
	}

	

	public void NoticiasEliminadas() {
		
		this.getContenido().as(VerticalLayout.class).removeAll();
		_noticiasEliminadas = new NoticiasEliminadas(this);
		this.getContenido().as(VerticalLayout.class).add(_noticiasEliminadas);
		
	}

	public void NoticiasAdministrador() {
		this.getContenido().as(VerticalLayout.class).removeAll();
		_noticiasAdministrador = new NoticiasAdministrador(this);
		this.getContenido().as(VerticalLayout.class).add(_noticiasAdministrador);
	}

	public void PublicarNoticia() {
		this.getContenido().as(VerticalLayout.class).removeAll();
		_publicarNoticia = new PublicarNoticia(this);
		this.getContenido().as(VerticalLayout.class).add(_publicarNoticia);
	}
	
	
	public void VerRegistrados() {
		this.getContenido().as(VerticalLayout.class).removeAll();
		_verRegistrados = new VerRegistrados(this);
		this.getContenido().as(VerticalLayout.class).add(_verRegistrados);
	}

}