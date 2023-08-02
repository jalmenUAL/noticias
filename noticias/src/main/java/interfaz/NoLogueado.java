package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNologueado;

public class NoLogueado extends VistaNologueado{
	public Login _login;
	
	public noticias.MainView MainView;
	
	public NoLogueado(noticias.MainView MainView) {
		_login = new Login(this);
		this.MainView = MainView;
		Login();
		
	}

	public void Login() {
		
		this.getContenido().as(VerticalLayout.class).add(_login);
	}
}