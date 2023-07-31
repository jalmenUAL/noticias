package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-veractividaditem template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-veractividaditem")
@JsModule("./src/vista-veractividaditem.ts")
public class VistaVeractividaditem extends LitTemplate {

    @Id("fecha")
	private Label fecha;
	@Id("actividad")
	private Label actividad;

	/**
     * Creates a new VistaVeractividaditem.
     */
    public VistaVeractividaditem() {
        // You can initialise any data required for the connected UI components here.
    }

	public Label getFecha() {
		return fecha;
	}

	public void setFecha(Label fecha) {
		this.fecha = fecha;
	}

	public Label getActividad() {
		return actividad;
	}

	public void setActividad(Label actividad) {
		this.actividad = actividad;
	}

}
