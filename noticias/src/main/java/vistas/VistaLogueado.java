package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

@Tag("vista-logueado")
@JsModule("./src/vista-logueado.ts")
public class VistaLogueado extends LitTemplate {

    
	@Id("noticiaseliminadas")
	private Button noticiaseliminadas;
	@Id("noticiasadministrador")
	private Button noticiasadministrador;
	@Id("publicarnoticia")
	private Button publicarnoticia;
	@Id("veractividad")
	private Button veractividad;
	@Id("ultimasnoticias")
	private Button ultimasnoticias;
	@Id("logout")
	private Button logout;
	@Id("contenido")
	private Element contenido;
	@Id("BuscarLayout")
	private Element buscarLayout;

	public VistaLogueado() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getNoticiaseliminadas() {
		return noticiaseliminadas;
	}

	public void setNoticiaseliminadas(Button noticiaseliminadas) {
		this.noticiaseliminadas = noticiaseliminadas;
	}

	public Button getNoticiasadministrador() {
		return noticiasadministrador;
	}

	public void setNoticiasadministrador(Button noticiasadministrador) {
		this.noticiasadministrador = noticiasadministrador;
	}

	public Button getPublicarnoticia() {
		return publicarnoticia;
	}

	public void setPublicarnoticia(Button publicarnoticia) {
		this.publicarnoticia = publicarnoticia;
	}

	public Button getVeractividad() {
		return veractividad;
	}

	public void setVeractividad(Button veractividad) {
		this.veractividad = veractividad;
	}

	public Button getUltimasnoticias() {
		return ultimasnoticias;
	}

	public void setUltimasnoticias(Button ultimasnoticias) {
		this.ultimasnoticias = ultimasnoticias;
	}

	public Button getLogout() {
		return logout;
	}

	public void setLogout(Button logout) {
		this.logout = logout;
	}

	public Element getContenido() {
		return contenido;
	}

	public void setContenido(Element contenido) {
		this.contenido = contenido;
	}

	public Element getBuscarLayout() {
		return buscarLayout;
	}

	public void setBuscarLayout(Element buscarLayout) {
		this.buscarLayout = buscarLayout;
	}

}