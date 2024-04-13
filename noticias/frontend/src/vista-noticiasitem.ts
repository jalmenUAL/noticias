import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-noticiasitem')
export class VistaNoticiasitem extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; ">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; flex-grow: 1;">
  <label id="texto" style="align-self: stretch; flex-grow: 1;">Label</label>
  <vaadin-button theme="primary" id="marcar" style="flex-grow: 0;">
    Marcar 
  </vaadin-button>
  <vaadin-button theme="primary" id="eliminar">
    Eliminar 
  </vaadin-button>
  <vaadin-button theme="primary" id="subir">
   Subir
  </vaadin-button>
  <vaadin-button theme="primary" id="bajar">
   Bajar
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
