package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class UltimasNoticias extends Noticias {
	 

	 

	public UltimasNoticias(Registrado _registrado) {
		super();
		this._registrado = _registrado;
	}

	//private event _ocultar;
	public Registrado _registrado;

	public void Ocultar() {
		throw new UnsupportedOperationException();
	}
}