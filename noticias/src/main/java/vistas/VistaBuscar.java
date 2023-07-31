package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Input;

@Tag("vista-buscar")
@JsModule("./src/vista-buscar.ts")
public class VistaBuscar extends LitTemplate {

    @Id("botonBuscar")
	private Button botonBuscar;
	@Id("textoBuscado")
	private Input textoBuscado;

	public VistaBuscar() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getBotonBuscar() {
		return botonBuscar;
	}

	public void setBotonBuscar(Button botonBuscar) {
		this.botonBuscar = botonBuscar;
	}

	public Input getTextoBuscado() {
		return textoBuscado;
	}

	public void setTextoBuscado(Input textoBuscado) {
		this.textoBuscado = textoBuscado;
	}

}