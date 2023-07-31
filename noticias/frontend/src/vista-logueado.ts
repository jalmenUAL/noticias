import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-logueado')
export class VistaLogueado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" id="BuscarLayout" style="flex-grow: 1;"></vaadin-vertical-layout>
  <vaadin-button theme="primary" id="noticiaseliminadas">
   Noticias Eliminadas
  </vaadin-button>
  <vaadin-button theme="primary" id="noticiasadministrador">
   Noticias(Administrador)
  </vaadin-button>
  <vaadin-button theme="primary" id="publicarnoticia">
   Publicar Noticia
  </vaadin-button>
  <vaadin-button theme="primary" id="veractividad">
   Ver Actividad
  </vaadin-button>
  <vaadin-button theme="primary" id="ultimasnoticias">
   Ultimas Noticias
  </vaadin-button>
  <vaadin-button theme="primary" id="logout">
   Logout
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="contenido" style="align-self: stretch; flex-grow: 1;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
