package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

@Tag("vista-login")
@JsModule("./src/vista-login.ts")
public class VistaLogin extends LitTemplate {

   
	@Id("login")
	private TextField login;
	@Id("password")
	private TextField password;
	@Id("botonlogin")
	private Button botonlogin;
	public VistaLogin() {
        // You can initialise any data required for the connected UI components here.
    }

	public TextField getLogin() {
		return login;
	}

	public void setLogin(TextField login) {
		this.login = login;
	}

	public TextField getPassword() {
		return password;
	}

	public void setPassword(TextField password) {
		this.password = password;
	}

	public Button getBotonlogin() {
		return botonlogin;
	}

	public void setBotonlogin(Button botonlogin) {
		this.botonlogin = botonlogin;
	}

}