package hotelNuevaIdea;

import ejerciciosIniciales.Hotel;

public class Testeo {
	public static void main(String[] args) {
		
		Hotelazo ht = new Hotelazo(4);
		
		ht.ocuparHabitacion(4, 2);
		ht.ocuparHabitacion(3, 6);
		ht.ocuparHabitacion(4, 2);
		ht.ocuparHabitacion(4, 2);
		
		System.out.println(ht.totalPersonas());
		System.out.println(ht.contarHabitacionesCon(4));
		ht.totalDePersonasPorPosicion();
	}
}
