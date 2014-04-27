
/*
 Modificaci�n Calidad: Ninguna.
 -Christian-
 */

/**
 * Autores: Andrea, Mar�a y Wei
 * */

public class Senal {
	
	private Coordenada posicion;
	private EstadoSenal estado;
	
	//Se construye pasando las coordenadas de la se�al y por defecto est� en rojo
	public Senal(coordenada posicion){
		this.posicion = posicion;
		this.estado = EstadoSenal.ROJO;
	}
	
	public void setEstado(){
		if (this.estado == EstadoSenal.ROJO) {
			this.estado = EstadoSenal.VERDE;
		}
		else {
			this.estado = EstadoSenal.ROJO;
		}
	}
	
	public EstadoSenal getEstado(){
		return this.estado;
	}
	
	public Coordenada getCoordenada(){
		return this.posicion;
	}
	
	public String toString(){
		Coordenada pos = this.posicion;
		return "Se�al ("+ pos + ")";
	}
}
