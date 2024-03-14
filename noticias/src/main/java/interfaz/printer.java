package interfaz;

import com.vaadin.flow.component.notification.Notification;

public class printer {
	 
	public Noticias_item _noticiasitem;
	public void imprimir(Noticias_item _noticiasitem) {
		Notification.show("Estoy imprimiendo las noticias");
	}
}