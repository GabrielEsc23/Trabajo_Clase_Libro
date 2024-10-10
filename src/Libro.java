public class Libro {
    // Atributos
    String titulo;
    String autor;
    String editorial;
    int paginas;

    // Constructor
    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public void imprimir() {
        System.out.println("El título es: " + this.titulo);
        System.out.println("El autor es: " + this.autor);
        System.out.println("La editorial es: " + this.editorial);
        System.out.println("El número de páginas es: " + this.paginas);
        System.out.println("---------------");
    }

    public int imprimirCubierta() {
        return this.paginas + 5;
    }
}
