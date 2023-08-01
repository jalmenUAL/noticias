package interfaz;

import com.vaadin.flow.component.notification.Notification;

public class printer {
	 

	public Noticias_item _noticiasitem;

	public void imprimir() {
		Notification.show("Estoy imprimiendo las noticias");
	}
}