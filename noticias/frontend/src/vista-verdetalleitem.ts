import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-verdetalleitem')
export class VistaVerdetalleitem extends LitElement {
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
 <label id="titulo" style="align-self: stretch;">Label</label>
 <label id="texto" style="align-self: stretch; flex-grow: 0;">Label</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; flex-shrink: 1;">
  <label style="flex-grow: 0; flex-shrink: 0;">Publicado por</label>
  <label id="publicado" style="flex-grow: 1;">Label</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
