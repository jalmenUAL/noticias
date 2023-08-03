package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ResultadodeBsqueda extends Noticias {
	public ResultadodeBsqueda(Logueado logueado) {
		super(logueado);
		this.getOcultar().setVisible(false);
		
		//Una noticia añadida a mano de prueba
		
		ResultadodeBsqueda_item n = new ResultadodeBsqueda_item(this);
	    this.getLista().as(VerticalLayout.class).add(n);
	}

	public Buscar _buscar;
}