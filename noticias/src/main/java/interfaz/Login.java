package interfaz;

import vistas.VistaLogin;

public class Login extends VistaLogin {
	public Login(NoLogueado _noLogueado) {
		super();
		this._noLogueado = _noLogueado;
		
		this.getBotonlogin().addClickListener(event->
		
				{ 
				if (this.getLogin().getValue().equals("usuario")) {
					
					_noLogueado.MainView.remove(_noLogueado.MainView.nologueado);
					_noLogueado.MainView.registrado = new Registrado(_noLogueado.MainView);
					_noLogueado.MainView.add(_noLogueado.MainView.registrado);
					
					
				}
				else {
					
					_noLogueado.MainView.remove(_noLogueado.MainView.nologueado);
					_noLogueado.MainView.admin = new Administrador(_noLogueado.MainView);
					_noLogueado.MainView.add(_noLogueado.MainView.admin);
					
					
				}
				}
				
				
				);
								
		
	}

	public NoLogueado _noLogueado;
}