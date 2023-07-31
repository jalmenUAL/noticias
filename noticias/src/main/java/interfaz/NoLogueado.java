package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNologueado;

public class NoLogueado extends VistaNologueado{
	public Login _login;
	
	public VerticalLayout MainView;
	
	public NoLogueado(VerticalLayout MainView) {
		
		this.MainView = MainView;
	}

	public void Login() {
		throw new UnsupportedOperationException();
	}
}