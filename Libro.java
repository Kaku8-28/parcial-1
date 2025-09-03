public class Libro {
    
    private String titulo;
    private String autor;
    private int numEjemplares=0;
    private int numPrestados=0;

    private String editorial;
    private int anoPublicacion=0;

    public Libro() {
    }

    
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
        
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anioPublicacion) {
        this.anoPublicacion = anioPublicacion;
    }

    
    public boolean prestamo() {
        if (numPrestados < numEjemplares) {
            numPrestados=numPrestados+1;
            return true;
        } else {
            return false;
        }
    }

    
    public boolean devolucion() {
        if (numPrestados > 0) {
            numPrestados=numPrestados-1;
            return true;
        } else {
            return false;
        }
    }
     public boolean disponible() {
        return numEjemplares > numPrestados;
     }
    
    @Override
    public String toString() {
        return "Título: " + titulo + 
               "\nAutor: " + autor +
               "\nEjemplares: " + numEjemplares +
               "\nPrestados: " + numPrestados +
               "\nEditorial: " + editorial +
                "\nAño de publicación: " + anoPublicacion;
    }
}
