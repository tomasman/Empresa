package ar.edu.unlam.pb2.empresa;

import org.junit.Assert;
import org.junit.Test;

public class EmpresaTest {

	public void testParaMostrarElDetalleDeLosEmpleado(){
		 		Empleado miEmpleadoGerente = new Gerente("Martin",20000.0,"25-1-1980");
		 		System.out.println(miEmpleadoGerente.brindarDetalles());
		 		
		 		Empleado miEmpleadoIngeniero = new Gerente("Tomas",15000.0,"25-1-1960");
		 		System.out.println(miEmpleadoIngeniero.brindarDetalles());
		 		
		 		Empleado miEmpleadaSecretaria = new Gerente("Sofia",10000.0,"25-1-1930");
		 		System.out.println(miEmpleadaSecretaria.brindarDetalles());

}
	@Test
	 	public void testearLosImpuestosALosGerentes(){
	 		Empleado miEmpleadoGerente = new Gerente("Martin",20000.0,"25-1-1980");
	 
		ServicioImpuesto miImpuesto = new ServicioImpuesto();
	  
	 		Double valorEsperado = 25000.0;
	 		Double valorActual = miImpuesto.obtenerImpuestos(miEmpleadoGerente);
	 		
	 		Assert.assertEquals(valorEsperado, valorActual);
	 	}
	 
		
	  	@Test
	 	public void testearDetallesEmpleado(){
	 		Empleado miEmpleado = new Empleado();
	 		miEmpleado.setNombre("Edu");
	 		miEmpleado.setSalario(12000.0);
	 		miEmpleado.setFechaDeCumpleaños("25-12-1990");
	  	}
	 		@Test	
	 	public void testearLosImpuestosALosIngenieros(){
	 		Empleado miEmpleadoIngeniero = new Ingeniero("Tomas",15000.0,"25-1-1960");
	 
	 		ServicioImpuesto miImpuesto = new ServicioImpuesto();
	 
	 		Double valorEsperado = 15000.0;
	 		Double valorActual = miImpuesto.obtenerImpuestos(miEmpleadoIngeniero);
	  		
	 		/*System.out.println(miEmpleadoIngeniero.brindarDetalles());*/
	 		Assert.assertEquals(valorEsperado, valorActual);
	 	}
	 	
	 	
	 	@Test
	 	public void testearLosImpuestosALasSecretarias(){
	 		Empleado miEmpleadoGerente = new Secretaria("Sofia",10000.0,"25-1-1930");
	  		
	 		ServicioImpuesto miImpuesto = new ServicioImpuesto();
	 
	 		Double valorEsperado = 10000.0;
	 		Double valorActual = miImpuesto.obtenerImpuestos(miEmpleadoGerente);
	  		
	 //		CuentaSueldo cuentaSueldo = new CuentaSueldo(5000.0);
	 //		cuentaSueldo.extraer(2000.0);
	 //		
	 //		Double valorEsperado = 3000.0;
	 //		Double valorActual = cuentaSueldo.getDineroDisponible();
	 //		
	 //		Assert.assertEquals(valorEsperado, valorActual);
	 		Assert.assertEquals(valorEsperado, valorActual);
	  	}
	  }

