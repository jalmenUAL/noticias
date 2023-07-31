package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

@Tag("vista-nologueado")
@JsModule("./src/vista-nologueado.ts")
public class VistaNologueado extends LitTemplate {

    @Id("contenido")
	private Element contenido;
	 
	 

	public VistaNologueado() {
        // You can initialise any data required for the connected UI components here.
    }



	public Element getContenido() {
		return contenido;
	}



	public void setContenido(Element contenido) {
		this.contenido = contenido;
	}

}