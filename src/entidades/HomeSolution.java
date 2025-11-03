package entidades;

import java.util.ArrayList;
import java.util.List;

public class HomeSolution implements IHomeSolution{
	private Integer IdEmpleado = 0;
	private Integer numeroProyecto = 0 ;
	private List <Tupla <Integer, Empleado>> empleados = new ArrayList<>();
	private List <Tupla <Integer, Proyecto>> proyectos = new ArrayList<>();

	@Override
	public void registrarEmpleado(String nombre, double valor) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado(nombre,valor);
		empleado.legajo=IdEmpleado;
		empleados.add(new Tupla<>(IdEmpleado,empleado));
		IdEmpleado++;
		
	}

	@Override
	public void registrarEmpleado(String nombre, double valor, String categoria) throws IllegalArgumentException {
		Empleado empleado = new Empleado(nombre,valor);
		empleados.add(new Tupla<>(IdEmpleado,empleado));
		IdEmpleado++;
		
	}

	@Override
	public void registrarProyecto(String[] titulos, String[] descripcion, double[] dias, String domicilio,
			String[] cliente, String inicio, String fin) throws IllegalArgumentException {
		
			Proyecto proyecto = new Proyecto(titulos, descripcion, dias, domicilio, cliente, inicio, fin);
			proyectos.add(new Tupla<>(numeroProyecto,proyecto));
			numeroProyecto++;
			
		
	}

	@Override
	public void asignarResponsableEnTarea(Integer numero, String titulo) throws Exception {
		// TODO Auto-generated method stub
		for(Tupla<Integer, Empleado> e : empleados) {
			Empleado empleado = e.getValor2();
			if(empleado.legajo == numero) {
				empleado.asignarTarea(titulo);
			}
		}
		
	}

	@Override
	public void asignarResponsableMenosRetraso(Integer numero, String titulo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarRetrasoEnTarea(Integer numero, String titulo, double cantidadDias)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarTareaEnProyecto(Integer numero, String titulo, String descripcion, double dias)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finalizarTarea(Integer numero, String titulo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finalizarProyecto(Integer numero, String fin) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reasignarEmpleadoEnProyecto(Integer numero, Integer legajo, String titulo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reasignarEmpleadoConMenosRetraso(Integer numero, String titulo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double costoProyecto(Integer numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Tupla<Integer, String>> proyectosFinalizados() {
		List<Tupla<Integer,String>> finalizados = new ArrayList<>();
		for(Tupla<Integer, Proyecto> p : proyectos) {
			if(p.getValor2().estado.equals("ACTIVOS")) {
				finalizados.add(new Tupla<>(p.getValor1(),p.getValor2().titulos[0]));
			}
		}
		return finalizados;
	}

	@Override
	public List<Tupla<Integer, String>> proyectosPendientes() {
		List<Tupla<Integer,String>> pendientes = new ArrayList<>();
		for(Tupla<Integer, Proyecto> p : proyectos) {
			if(p.getValor2().estado.equals("PENDIENTE")) {
				pendientes.add(new Tupla<>(p.getValor1(),p.getValor2().titulos[0]));
			}
		}
		return pendientes;
	}

	@Override
	public List<Tupla<Integer, String>> proyectosActivos() {
		List<Tupla<Integer,String>> activos = new ArrayList<>();
		for(Tupla<Integer, Proyecto> p : proyectos) {
			if(p.getValor2().estado.equals("ACTIVOS")) {
				activos.add(new Tupla<>(p.getValor1(),p.getValor2().titulos[0]));
			}
		}
		return activos;
	}

	@Override
	public Object[] empleadosNoAsignados() {
		  List<String> empleadosNoasignados = new ArrayList<>();

		    for (Tupla<Integer, Empleado> e : empleados) {
		        empleadosNoasignados.add(e.getValor2().nombre);
		    }

		    return empleadosNoasignados.toArray();
	}

	@Override
	public boolean estaFinalizado(Integer numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int consultarCantidadRetrasosEmpleado(Integer legajo) {
		
		return 0;
	}

	@Override
	public List<Tupla<Integer, String>> empleadosAsignadosAProyecto(Integer numero) {
		List<Tupla<Integer,String>> empleadosAsignados = new ArrayList<>();
		
		for(Tupla<Integer, Empleado> e :empleados) {
			Empleado empleado = e.getValor2();
			if(empleado.legajo == numero) {
				empleadosAsignados.add(new Tupla<>(empleado.legajo,empleado.nombre));
			}
		}
		
		return empleadosAsignados;
	}

	@Override
	public Object[] tareasProyectoNoAsignadas(Integer numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] tareasDeUnProyecto(Integer numero) {
		Object[] proyecto = null;
		for(Tupla<Integer, Proyecto> p :proyectos) {
			if(p.getValor1() == numero) {
				proyecto = p.getValor2().titulos;
				System.out.print(proyecto);
			}
		}
		return proyecto;
	}

	@Override
	public String consultarDomicilioProyecto(Integer numero) {
		String proyecto = null;
		for(Tupla<Integer, Proyecto> p :proyectos) {
			if(p.getValor1() == numero) {
				proyecto = p.getValor2().domicilio;
				System.out.print(proyecto);
			}
		}
		return proyecto;
	}

	@Override
	public boolean tieneRestrasos(Integer legajo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Tupla<Integer, String>> empleados() {
		// TODO Auto-generated method stub
		List <Tupla<Integer,String>> lista = new ArrayList<>();
		for(Tupla<Integer, Empleado> e : empleados) {
			lista.add(new Tupla<>(e.getValor2().legajo,e.getValor2().nombre));
		}
		return lista;
	}

	@Override
	public String consultarProyecto(Integer numero) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}
