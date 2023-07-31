package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-veractividad")
@JsModule("./src/vista-veractividad.ts")
public class VistaVeractividad extends LitTemplate {

    @Id("actividades")
	private Element actividades;

	public VistaVeractividad() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getActividades() {
		return actividades;
	}

	public void setActividades(Element actividades) {
		this.actividades = actividades;
	}

}