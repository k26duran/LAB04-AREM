package app;

import edu.escuelaing.arem.ASE.app.Web;

@Web("Service")
public class Example {
	
	@Web("cuadrado2")
	public static String square() {
		return "<html><head><meta charset=\"utf-8\" /><title>Proyecto AREM</title></head><body><h1> Cuadrado 2</h1></body></html>";
	}
	@Web("cuadrado3")
	public static String square1() {
		return "<html><head><meta charset=\"utf-8\" /><title>Proyecto AREM</title></head><body><h1> Cuadrado 3 </h1></body></html>";
	}

}
