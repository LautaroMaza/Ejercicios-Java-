package Punto_6;

import java.util.Scanner;

public class Empleado {
	private Scanner teclado;
	private String nombre;
	private int sueldo;

public void cargar() { //m�todo
   teclado= new Scanner(System.in);
   System.out.print("Ingrese nombre:");
   nombre=teclado.next();
   System.out.print("Ingrese sueldo:");
   sueldo=teclado.nextInt();
}

public void imprimir() { //m�todo
	   System.out.println("nombre: "+nombre);
	   System.out.println("sueldo:"+sueldo);
}

public void Impuestos() { //m�todo
	   if (sueldo>3000) {
		   System.out.print(nombre+" debe pagar impuestos");
	   }else{
		   System.out.print(nombre+" no debe pagar impuestos");
	   }
}

public static void main (String[] ar) {
	   Empleado Empleado;
	   Empleado = new Empleado();
	   Empleado.cargar();
	   Empleado.imprimir();
	   Empleado.Impuestos();
}
}