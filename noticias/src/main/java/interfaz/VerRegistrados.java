package interfaz;

import java.util.Vector;

import vistas.VistaVerregistrados;

public class VerRegistrados extends VistaVerregistrados {
	
	public Administrador _administrador;
	public Vector<VerRegistrados_item> _item = new Vector<VerRegistrados_item>();
	
	public VerRegistrados(Administrador _administrador) {
		super();
		this._administrador = _administrador;
	}
	
	
	 
}