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
<vaadin-vertical-layout style="position: absolute; height: 100%; width: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; width: 100%;">
  <vaadin-vertical-layout theme="spacing" id="BuscarLayout" style="flex-grow: 1; width: 100%; align-items: stretch;"></vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center; align-items: center; flex-grow: 1; width: 100%;">
   <vaadin-button theme="primary" id="noticiaseliminadas" style="flex-grow: 1; align-self: center;">
     Noticias Eliminadas 
   </vaadin-button>
   <vaadin-button theme="primary" id="noticiasadministrador" style="flex-grow: 1; align-self: center;">
     Noticias(Administrador) 
   </vaadin-button>
   <vaadin-button theme="primary" id="publicarnoticia" style="flex-grow: 1; align-self: center;">
     Publicar Noticia 
   </vaadin-button>
   <vaadin-button theme="primary" id="veractividad" style="flex-grow: 1; align-self: center;">
     Ver Actividad 
   </vaadin-button>
   <vaadin-button theme="primary" id="ultimasnoticias" style="flex-grow: 1; align-self: center;">
     Ultimas Noticias 
   </vaadin-button>
   <vaadin-button theme="primary" id="Verregistrados">
    Ver Registrados
   </vaadin-button>
   <vaadin-button theme="primary" id="logout" style="flex-grow: 1; align-self: center;">
     Logout 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="contenido" style="align-self: stretch; flex-grow: 1; width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
