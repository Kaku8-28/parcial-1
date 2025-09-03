import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

       Libro libro1 = new Libro("TRES NOVELAS EJEMPLARES", "MIGUEL DE CERVANTES", 5, 0);
        
        libro1.setEditorial("Grupo Editorial Norma (Colección Cara y Cruz)");
        libro1.setAnoPublicacion(2018);
          
        Libro libro2 = new Libro();

        System.out.println("Ingrese el título del libro 2:");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese el autor del libro 2:");
        libro2.setAutor(sc.nextLine());

        System.out.println("Ingrese el número de ejemplares:");
        libro2.setNumEjemplares(sc.nextInt());

        System.out.println("Ingrese la editorial:");
        libro2.setEditorial(sc.nextLine());
        
        System.out.println("Ingrese el año de publicacion:");
        libro2.setAnoPublicacion(sc.nextInt());

       
        System.out.println("\n====Informacion libros====");
        System.out.println(libro1);
        System.out.println("-------------------------");
        System.out.println(libro2);
        System.out.println("-------------------------\n");

        
        System.out.println("...prestamo de libros...");
        if (libro1.getNumEjemplares() > 0) {
            if (libro1.prestamo()) {
                System.out.println("Se prestó un ejemplar de: " + libro1.getTitulo());
            } else {
                System.out.println("Ya todos los ejemplares de " + libro1.getTitulo() + " están prestados.");
            }
        } else {
            System.out.println("El libro " + libro1.getTitulo() + " no tiene ejemplares en la biblioteca.");
        }

        if (libro2.getNumEjemplares() > 0) {
            if (libro2.prestamo()) {
                System.out.println("Se prestó un ejemplar de: " + libro2.getTitulo());
            } else {
                System.out.println("Ya todos los ejemplares de " + libro2.getTitulo() + " están prestados.");
            }
        } else {
            System.out.println("El libro " + libro2.getTitulo() + " no tiene ejemplares en la biblioteca.");
        }

        
        System.out.println("\n====Estado préstamos====");
        System.out.println(libro1);
        System.out.println("-------------------------");
        System.out.println(libro2);
        System.out.println("-------------------------\n");

        // Intentar devolver libros
        System.out.println("...Devolucion libros...");
        if (libro1.getNumPrestados() > 0) {
            if (libro1.devolucion()) {
                System.out.println("Se devolvió un ejemplar de: " + libro1.getTitulo());
            } else {
                System.out.println("No se pudo devolver el libro " + libro1.getTitulo());
            }
        } else {
            System.out.println("No hay ejemplares prestados de " + libro1.getTitulo());
        }

        if (libro2.getNumPrestados() > 0) {
            if (libro2.devolucion()) {
                System.out.println("Se devolvió un ejemplar de: " + libro2.getTitulo());
            } else {
                System.out.println("No se pudo devolver el libro " + libro2.getTitulo());
            }
        } else {
            System.out.println("No hay ejemplares prestados de " + libro2.getTitulo());
        }

        
        System.out.println("\n----Informe final de los libros----");
        System.out.println(libro1);
        System.out.println("-------------------------");
        System.out.println(libro2);
    }
}
