package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-verdetalleitem template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verdetalleitem")
@JsModule("./src/vista-verdetalleitem.ts")
public class VistaVerdetalleitem extends LitTemplate {

    @Id("texto")
	private Label texto;
	@Id("publicado")
	private Label publicado;

	/**
     * Creates a new VistaVerdetalleitem.
     */
    public VistaVerdetalleitem() {
        // You can initialise any data required for the connected UI components here.
    }

	public Label getTexto() {
		return texto;
	}

	public void setTexto(Label texto) {
		this.texto = texto;
	}

	public Label getPublicado() {
		return publicado;
	}

	public void setPublicado(Label publicado) {
		this.publicado = publicado;
	}

}
