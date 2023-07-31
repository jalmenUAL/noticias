package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Perfil extends Logueado {
	public VerActividad _verActividad;

	public Perfil(VerticalLayout MainView) {
		
		super(MainView);
		this.getNoticiasadministrador().setVisible(false);
		this.getUltimasnoticias().setVisible(false);
		this.getPublicarnoticia().setVisible(false);
		this.getNoticiaseliminadas().setVisible(false);
		
	}
	
	public void VerActividad() {
		throw new UnsupportedOperationException();
	}
}