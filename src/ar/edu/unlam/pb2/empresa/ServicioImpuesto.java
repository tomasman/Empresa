package ar.edu.unlam.pb2.empresa;

public class ServicioImpuesto {
	private final double sueldo_gerente=20000.0;
	 	private final double sueldo_ingeniero=15000.0;
	 	private final double sueldo_secretaria=10000.0;
	 	private final double salario_exstra_para_gastos_vehiculo=5000.0;
	 	
	 	public double obtenerImpuestos(Empleado miEmpleado){
	 		if(miEmpleado.getSalario()==sueldo_gerente){
				double salarioConImpuesto = miEmpleado.getSalario()+salario_exstra_para_gastos_vehiculo;
	 			return salarioConImpuesto;
	 		}else if(miEmpleado.getSalario()==sueldo_ingeniero){
	 			return this.sueldo_ingeniero;
	 		}else if(miEmpleado.getSalario()==sueldo_secretaria){
	 			return this.sueldo_secretaria;
	 		}else{
	 			return 0.0;
	 		}
	 		
	 	}

}
