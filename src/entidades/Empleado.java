package entidades;

import java.util.List;

public class Empleado {
	public Integer legajo;
	public Integer retraso;
	public String nombre;
	public List<String> tareas;
	private Double valor;
	Empleado(String nombre, Double valor){
		this.valor = valor;
		this.nombre = nombre;
		this.retraso = 0 ;
	
	}
	public void asignarTarea(String tarea){
		this.tareas.add(tarea);
	}
}
