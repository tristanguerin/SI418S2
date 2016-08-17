package pe.edu.upc.view;

import pe.edu.upc.entity.Fruta;

public class AppFruteriasUPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruta objFruta = new Fruta("Mango", "Amarillo", "Dulce");
		System.out.println(objFruta);
		Fruta.LugarOrigen = "Otro lugar";
		System.out.println(objFruta);
	}

}
