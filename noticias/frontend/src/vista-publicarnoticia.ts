import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-publicarnoticia')
export class VistaPublicarnoticia extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position: absolute;">
 <vaadin-text-field error-message="Escriba el texto de una noticia" required invalid="" label="Titulo de la Noticia" id="titulo" style="align-self: stretch;"></vaadin-text-field>
 <vaadin-button theme="primary" id="publicar">
   Publicar 
 </vaadin-button>
 <vaadin-text-area label="Texto completo" placeholder="Escriba el texto completo aquí" id="texto" style="align-self: stretch;"></vaadin-text-area>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
