package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-verregistradositem template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verregistradositem")
@JsModule("./src/vista-verregistradositem.ts")
public class VistaVerregistradositem extends LitTemplate {

    @Id("login")
	private Label login;
	@Id("password")
	private Label password;
	@Id("verperfil")
	private Button verperfil;

	/**
     * Creates a new VistaVerregistradositem.
     */
    public VistaVerregistradositem() {
        // You can initialise any data required for the connected UI components here.
    }

}
