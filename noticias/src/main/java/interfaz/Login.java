package interfaz;

import vistas.VistaLogin;

public class Login extends VistaLogin {
	
	public NoLogueado _noLogueado;
	
	public Login(NoLogueado _noLogueado) {
		super();
		this._noLogueado = _noLogueado;
		
		this.getBotonlogin().addClickListener(event->
		
				{ 
				if (this.getLogin().getValue().equals("usuario")) {
					
					_noLogueado.MainView.removeAll();
					 Registrado registrado = new Registrado(_noLogueado.MainView);
					_noLogueado.MainView.add(registrado);
						
				}
				else {
					
					_noLogueado.MainView.removeAll();
					Administrador admin = new Administrador(_noLogueado.MainView);
					_noLogueado.MainView.add(admin);
					
					
				}
				}
				
				
				);
								
		
	}

	
}