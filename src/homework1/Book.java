package homework1;

import java.util.Objects;

public class Book {
    private String name;
    private final String author;
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


  @Override
  public  String toString() {
        return "Наименование книги: "+this.name+" Автор: "+author+" Дата публикации: "+dateOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return dateOfPublication == book.dateOfPublication && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, dateOfPublication);
    }
}



