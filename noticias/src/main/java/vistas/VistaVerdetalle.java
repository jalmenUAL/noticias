package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-verdetalle")
@JsModule("./src/vista-verdetalle.ts")
public class VistaVerdetalle extends LitTemplate {

    @Id("detalles")
	private Element detalles;

	public VistaVerdetalle() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getDetalles() {
		return detalles;
	}

	public void setDetalles(Element detalles) {
		this.detalles = detalles;
	}

}