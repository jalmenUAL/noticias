package interfaz;

import vistas.VistaLogin;

public class Login extends VistaLogin {
	public Login(NoLogueado _noLogueado) {
		super();
		this._noLogueado = _noLogueado;
	}

	public NoLogueado _noLogueado;
}