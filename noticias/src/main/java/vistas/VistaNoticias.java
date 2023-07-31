package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

@Tag("vista-noticias")
@JsModule("./src/vista-noticias.ts")
public class VistaNoticias extends LitTemplate {

    @Id("verdetalle")
	private Button verdetalle;
	@Id("ocultar")
	private Button ocultar;
	@Id("imprimir")
	private Button imprimir;
	@Id("lista")
	private Element lista;

	public VistaNoticias() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getVerdetalle() {
		return verdetalle;
	}

	public void setVerdetalle(Button verdetalle) {
		this.verdetalle = verdetalle;
	}

	public Button getOcultar() {
		return ocultar;
	}

	public void setOcultar(Button ocultar) {
		this.ocultar = ocultar;
	}

	public Button getImprimir() {
		return imprimir;
	}

	public void setImprimir(Button imprimir) {
		this.imprimir = imprimir;
	}

	public Element getLista() {
		return lista;
	}

	public void setLista(Element lista) {
		this.lista = lista;
	}

}