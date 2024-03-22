package hotelNuevaIdea;

import java.util.ArrayList;
import java.util.List;

public class Hotelazo {
	private ArrayList<Habitacion> habitaciones;
	
	public Hotelazo(int cantHabitaciones) {
		this.habitaciones = new ArrayList<Habitacion>(cantHabitaciones);
	}
	
	public void ocuparHabitacion(int mayores, int menores) {
		Habitacion h = new Habitacion(mayores,menores);
		habitaciones.add(h);
	}
	
	public int totalPersonas() {
		int contador=0;
		for (Habitacion habitacion : habitaciones) {
			contador += habitacion.getTotal();
		}
		return contador;
	}
	
	public int contarHabitacionesCon(int mayores) {
		int contador = 0;
		
		for (Habitacion habitacion : habitaciones) {
			if(habitacion.getMayores() == mayores) {
				contador++;
			}
		}
		return contador;
	}
	
	public void totalDePersonasPorPosicion() {
		ArrayList<Habitacion> aux = new ArrayList<Habitacion>(9);
		int contador=0;
		
		for (Habitacion habitacion : habitaciones) {
			if(habitacion.getTotal() == contador) {
				aux.add(habitacion);
				contador++;
			}
		}
		for (Habitacion habitacion : aux) {
			System.out.println(aux);
		}
		
	}
}
