package clase_Alumno_0;
import java.util.Scanner;
public class Clase_Alumno_0 {
	public static void main(String[]arg) {
		Scanner e = new Scanner(System.in);
		int numero = 0, nota1=0, nota2=0;
		String nombre = null;
		System.out.print("Número? ");
		numero = e.nextInt();
		e.nextLine();
		System.out.print("Nombre? ");
		nombre = e.nextLine();
		System.out.print("Nota 1? ");
		nota1 = e.nextInt();
		System.out.print("Nota 2? ");
		nota2 = e.nextInt();
		Alumno alumno = new Alumno (numero,nombre,nota1,nota2);
		System.out.println("\nVisualizar datos(método de clase): ");
		alumno.visualizarDatos();
		System.out.println("\nVisualizar datos:");
		System.out.println("Número = "+numero);
		System.out.println("Nombre = "+nombre);
		System.out.println("Nota 1 = "+nota1);
		System.out.println("Nota 2 = "+nota2);
		System.out.print("Número? ");
		numero = e.nextInt();
		e.nextLine();
		System.out.print("Nombre? ");
		nombre = e.nextLine();
		System.out.print("Nota 1? ");
		nota1 = e.nextInt();
		System.out.print("Nota 2? ");
		nota2 = e.nextInt();
		System.out.println("\nVisualizar datos(método de clase): ");
		alumno.visualizarDatos();
		System.out.println("\nVisualizar datos:");
		System.out.println("Número = "+alumno.getNumero());
		System.out.println("Nombre = "+alumno.getNombre());
		System.out.println("Nota 1 = "+alumno.getNota1());
		System.out.println("Nota 2 = "+alumno.getNota2());
		
		
		e.close();
	}
}
