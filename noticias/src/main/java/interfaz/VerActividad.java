package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVeractividad;

public class VerActividad extends VistaVeractividad {
	public VerActividad(Perfil _perfil) {
		super();
		this._perfil = _perfil;
	}
	public Perfil _perfil;
	public Vector<VerActividad_item> _item = new Vector<VerActividad_item>();
	
	 
		
		
	
}