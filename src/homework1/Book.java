package homework1;

public class Book {
    private String name;
    private String author;
    private int dateOfPublication;

    public Book(String name, int dateOfPublication, String Autor) {
        this.name = name;
        this.dateOfPublication = dateOfPublication;
        this.author = Autor;


    }

    public String getName() {
        return this.name;
    }

    public int getDateOfPublication() {
        return this.dateOfPublication;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public void setAuthor(String author) {
        this.author = author;

    }
}

