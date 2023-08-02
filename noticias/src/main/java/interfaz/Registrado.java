package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Registrado extends Logueado {
	
	public Registrado(noticias.MainView MainView) {
		super(MainView);
		// TODO Auto-generated constructor stub
		this.getNoticiasadministrador().setVisible(false);
		this.getVeractividad().setVisible(false);
		this.getPublicarnoticia().setVisible(false);
		this.getNoticiaseliminadas().setVisible(false);
		this.getVerregistrados().setVisible(false);
		
		this.getUltimasnoticias().addClickListener(event->UltimasNoticias());
	}

	public UltimasNoticias _ultimasNoticias;

	public void UltimasNoticias() {
		
		this.getContenido().as(VerticalLayout.class).removeAll();
		_ultimasNoticias = new UltimasNoticias(this);
		this.getContenido().as(VerticalLayout.class).add(_ultimasNoticias);
	}
}