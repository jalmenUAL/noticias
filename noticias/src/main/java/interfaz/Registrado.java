package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Registrado extends Logueado {
	
	public Registrado(VerticalLayout MainView) {
		super(MainView);
		// TODO Auto-generated constructor stub
		this.getNoticiasadministrador().setVisible(false);
		this.getVeractividad().setVisible(false);
		this.getPublicarnoticia().setVisible(false);
		this.getNoticiaseliminadas().setVisible(false);
	}

	public UltimasNoticias _ultimasNoticias;

	public void UltimasNoticias() {
		throw new UnsupportedOperationException();
	}
}