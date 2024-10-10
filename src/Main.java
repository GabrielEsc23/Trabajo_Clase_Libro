import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola a todos");

        // Declarar objetos
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Sudamericana", 400);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Planeta", 500);
        Libro libro3 = new Libro("El túnel", "Ernesto Sabato", "Losada", 250);
        Libro libro4 = new Libro("La casa de los espíritus", "Isabel Allende", "Plaza & Janés", 450);
        Libro libro5 = new Libro("Ficciones", "Jorge Luis Borges", "Sur", 300);

        libro1.imprimir();
        System.out.println("Número de páginas con cubierta: " + libro1.imprimirCubierta());

        libro2.imprimir();
        System.out.println("Número de páginas con cubierta: " + libro2.imprimirCubierta());

        libro3.imprimir();
        System.out.println("Número de páginas con cubierta: " + libro3.imprimirCubierta());

        libro4.imprimir();
        System.out.println("Número de páginas con cubierta: " + libro4.imprimirCubierta());

        libro5.imprimir();
        System.out.println("Número de páginas con cubierta: " + libro5.imprimirCubierta());
    }
}
