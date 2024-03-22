package hotelNuevaIdea;

public class Habitacion {

	private int mayores;
	private int menores;
	private String juntos;
	public Habitacion(int mayores, int menores) {
		this.mayores = mayores;
		this.menores = menores;
	}
	
	public String getCantEnLaHabitacion() {
		return juntos;
	}
	public void setCantEnLaHabitacion(int mayores, int menores) {
		this.juntos = "hay :" +(mayores + menores) + "en la habitacion";
	}
	public int getMayores() {
		return mayores;
	}
	public void setMayores(int mayores) {
		this.mayores = mayores;
	}
	public int getTotal() {
		return this.mayores+this.menores;
	}
	
	
}
