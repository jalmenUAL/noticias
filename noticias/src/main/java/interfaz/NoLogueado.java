package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNologueado;

public class NoLogueado extends VistaNologueado{
	
	public Login _login;
	public noticias.MainView MainView;
	
	public NoLogueado(noticias.MainView MainView) {
		_login = new Login(this);
		this.MainView = MainView;
		this.getLogin().addClickListener(event->
			{	this.MainView.removeAll();
				Login();
			});	
	}

	public void Login() {	
		this.MainView.add(_login);
	}
}