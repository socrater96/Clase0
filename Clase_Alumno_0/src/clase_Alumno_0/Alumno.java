package clase_Alumno_0;

public class Alumno {
	private int numero;
	private String nombre;
	private int nota1;
	private int nota2;
	Alumno(){};
	Alumno(int numero, String nombre, int  nota1, int nota2){
		this.numero = numero;
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	int getNumero() {
		return this.numero;
	}
	String getNombre() {
		return this.nombre;
	}
	int getNota1() {
		return this.nota1;
	}
	int getNota2() {
		return this.nota2;
	}
	void setNumero(int numero) {
		this.numero = numero;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	void visualizarDatos() {
		System.out.println("Número: "+this.numero);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Nota 1: "+this.nota1);
		System.out.println("Nota 2: "+this.nota2);
	}
}
