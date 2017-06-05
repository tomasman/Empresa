package ar.edu.unlam.pb2.empresa;

public class Empleado {
	private String nombre;
  	private double salario;
  	private String fechaDeCumpleaños;
  	
 	
 	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getFechaDeCumpleaños() {
		return fechaDeCumpleaños;
	}


	public void setFechaDeCumpleaños(String fechaDeCumpleaños) {
		this.fechaDeCumpleaños = fechaDeCumpleaños;
	}


	public Empleado(String nombre, double salario, String fechaDeCumpleaños) {
 		this.nombre = nombre;
    	this.salario = salario;
 		this.fechaDeCumpleaños = fechaDeCumpleaños;
  	}


	public Empleado() {
	}


	public char[] brindarDetalles() {
		return null;
	}
}
