package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import noticias.MainView;
import vistas.VistaLogueado;

public class Logueado extends VistaLogueado {
	//private event _logout;
	public Buscar _buscar;
	public MainView MainView;
	
	public Logueado(MainView MainView) {
		
		this.MainView = MainView;
		
		_buscar = new Buscar(this);
		
		Buscar();
		
		this.getLogout().addClickListener(event->Logout());
		
		
		
	}

	public void Buscar() {
		this.getBuscarLayout().as(VerticalLayout.class).add(_buscar);
	}

	public void Logout() {
	
		MainView.remove(this);
		MainView.add(MainView.nologueado);
	}
}