package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-verregistrados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verregistrados")
@JsModule("./src/vista-verregistrados.ts")
public class VistaVerregistrados extends LitTemplate {

    @Id("contenido")
	private Element contenido;

	/**
     * Creates a new VistaVerregistrados.
     */
    public VistaVerregistrados() {
        // You can initialise any data required for the connected UI components here.
    }

}
