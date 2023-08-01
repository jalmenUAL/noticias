package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLogueado;

public class Logueado extends VistaLogueado {
	//private event _logout;
	public Buscar _buscar;
	public VerticalLayout MainView;
	
	public Logueado(VerticalLayout MainView) {
		
		this.MainView = MainView;
		
		_buscar = new Buscar(this);
		this.getBuscarLayout().as(VerticalLayout.class).add(_buscar);
		
		
		
		
	}

	public void Buscar() {
		throw new UnsupportedOperationException();
	}

	public void Logout() {
		throw new UnsupportedOperationException();
	}
}