package interfaz;

public class ResultadodeBsqueda extends Noticias {
	public ResultadodeBsqueda(Logueado logueado) {
		super(logueado);
		this.getOcultar().setVisible(false);
	}

	public Buscar _buscar;
}