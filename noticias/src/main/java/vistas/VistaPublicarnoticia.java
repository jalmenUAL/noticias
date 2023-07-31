package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-publicarnoticia")
@JsModule("./src/vista-publicarnoticia.ts")
public class VistaPublicarnoticia extends LitTemplate {

    @Id("titulo")
	private TextField titulo;
	@Id("texto")
	private TextArea texto;
	@Id("publicar")
	private Button publicar;
	public VistaPublicarnoticia() {
        // You can initialise any data required for the connected UI components here.
    }
	public TextField getTitulo() {
		return titulo;
	}
	public void setTitulo(TextField titulo) {
		this.titulo = titulo;
	}
	public TextArea getTexto() {
		return texto;
	}
	public void setTexto(TextArea texto) {
		this.texto = texto;
	}
	public Button getPublicar() {
		return publicar;
	}
	public void setPublicar(Button publicar) {
		this.publicar = publicar;
	}

}