import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-noticias')
export class VistaNoticias extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label style="align-self: center;">Noticias </label>
 <vaadin-vertical-layout theme="spacing" id="lista" style="align-self: stretch; flex-grow: 1;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
  <vaadin-button theme="primary" id="imprimir">
   Imprimir
  </vaadin-button>
  <vaadin-button theme="primary" id="verdetalle">
   Ver Detalle
  </vaadin-button>
  <vaadin-button theme="primary" id="ocultar">
   Ocultar
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
