package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Perfil extends Logueado {
	public VerActividad _verActividad;

	public Perfil(noticias.MainView MainView) {
		
		super(MainView);
		this.getNoticiasadministrador().setVisible(false);
		this.getUltimasnoticias().setVisible(false);
		this.getPublicarnoticia().setVisible(false);
		this.getNoticiaseliminadas().setVisible(false);
		
	}
	
	public void VerActividad() {
		_verActividad = new VerActividad(this);
		this.getContenido().as(VerticalLayout.class).add(_verActividad);
		
		
	}
}