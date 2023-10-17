class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + precio);
    }
}

class LibroDeTexto extends Libro {
    private String curso;

    public LibroDeTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + curso);
    }
}

class LibroDeTextoUNAL extends LibroDeTexto {
    private String facultad;

    public LibroDeTextoUNAL(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Facultad: " + facultad);
    }
}

class Novela extends Libro {
    private String tipo;

    public Novela(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de Novela: " + tipo);
    }
}

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 15.99);
        libro1.imprimir();

        LibroDeTexto libro2 = new LibroDeTexto("Matemáticas Avanzadas", "John Smith", 49.99, "Cálculo III");
        libro2.imprimir();

        LibroDeTextoUNAL libro3 = new LibroDeTextoUNAL("Química Orgánica", "Maria Rodriguez", 39.99, "Química Orgánica", "Facultad de Ciencias");
        libro3.imprimir();

        Novela libro4 = new Novela("Cien años de soledad", "Gabriel García Márquez", 12.99, "Realista");
        libro4.imprimir();
    }
}
