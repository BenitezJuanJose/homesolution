package entidades;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    public Integer legajo;
    public Integer retraso;
    public String nombre;
    public List<String> tareas;
    private Double valor;
    public boolean tieneRetraso;

    public Empleado(String nombre, Double valor) {
        this.valor = valor;
        this.nombre = nombre;
        this.retraso = 0;
        this.tareas = new ArrayList<>(); 
        this.tieneRetraso = this.retraso >0;
    } 

    public void asignarTarea(String tarea) {
        this.tareas.add(tarea);
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return nombre + " (legajo " + legajo + ")";
    }
}
