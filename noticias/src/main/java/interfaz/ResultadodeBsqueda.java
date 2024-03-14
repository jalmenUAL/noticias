package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ResultadodeBsqueda extends Noticias {
	Logueado _logueado;
	
	public ResultadodeBsqueda(Logueado logueado) {
		super();
		_logueado = logueado;
		this.getOcultar().setVisible(false);
		
		this.getVerdetalle().addClickListener(event->VerDetalle());
		
		ResultadodeBsqueda_item n = new ResultadodeBsqueda_item(this);
	    this.getLista().as(VerticalLayout.class).add(n);
	}

	public Buscar _buscar;
	
	public void VerDetalle() {
		_verDetalle = new VerDetalle(this);
		_logueado.getContenido().as(VerticalLayout.class).remove(this);
		_logueado.getContenido().as(VerticalLayout.class).add(_verDetalle);
	}
}