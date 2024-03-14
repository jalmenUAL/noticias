package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBuscar;

public class Buscar extends VistaBuscar {
	public Logueado _logueado;
	public ResultadodeBsqueda _resultadodeBsqueda;
	
	public Buscar(Logueado _logueado) {
		super();
		this._logueado = _logueado;
		this.getBotonBuscar().addClickListener(event->ResultadodeBsqueda());
		
	}

	public void ResultadodeBsqueda() {

		_logueado.getContenido().as(VerticalLayout.class).removeAll();
		_resultadodeBsqueda = new ResultadodeBsqueda(_logueado);
		_logueado.getContenido().as(VerticalLayout.class).add(_resultadodeBsqueda);
		
	}

	
	
}