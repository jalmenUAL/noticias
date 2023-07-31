package interfaz;

import vistas.VistaPublicarnoticia;

public class PublicarNoticia extends VistaPublicarnoticia {
	public PublicarNoticia(Administrador _administrador) {
		super();
		this._administrador = _administrador;
	}

	public Administrador _administrador;
}