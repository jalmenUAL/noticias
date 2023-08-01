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
	}

	public UltimasNoticias _ultimasNoticias;

	public void UltimasNoticias() {
		_ultimasNoticias = new UltimasNoticias(this);
		this.getContenido().as(VerticalLayout.class).add(_ultimasNoticias);
	}
}