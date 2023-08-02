import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscar')
export class VistaBuscar extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%;">
 <vaadin-button theme="primary" id="botonBuscar" style="flex-grow: 1; flex-shrink: 1;">
   Buscar 
 </vaadin-button>
 <input type="text" id="textoBuscado" style="flex-shrink: 1; flex-grow: 1; width: 100%;">
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
