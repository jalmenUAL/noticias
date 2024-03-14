package interfaz;

import vistas.VistaVerregistradositem;

public class VerRegistrados_item extends VistaVerregistradositem {
	
	//private event _perfil;
		public VerRegistrados _verRegistrados;
	
	public VerRegistrados_item(VerRegistrados _verRegistrados) {
		super();
		this._verRegistrados = _verRegistrados;
	}

	public void Perfil() {
		this._verRegistrados._administrador.MainView.remove(this);
		Perfil perfil = new Perfil(this._verRegistrados._administrador.MainView);
		this._verRegistrados._administrador.MainView.add(perfil);
	}
}