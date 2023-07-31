package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-noticiasitem template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-noticiasitem")
@JsModule("./src/vista-noticiasitem.ts")
public class VistaNoticiasitem extends LitTemplate {

    @Id("texto")
	private Label texto;
	@Id("marcar")
	private Button marcar;
	@Id("eliminar")
	private Button eliminar;

	/**
     * Creates a new VistaNoticiasitem.
     */
    public VistaNoticiasitem() {
        // You can initialise any data required for the connected UI components here.
    }

	public Label getTexto() {
		return texto;
	}

	public void setTexto(Label texto) {
		this.texto = texto;
	}

	public Button getMarcar() {
		return marcar;
	}

	public void setMarcar(Button marcar) {
		this.marcar = marcar;
	}

	public Button getEliminar() {
		return eliminar;
	}

	public void setEliminar(Button eliminar) {
		this.eliminar = eliminar;
	}

}
