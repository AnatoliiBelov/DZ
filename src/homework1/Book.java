package homework1;

class Book {
    String name;
    int dateOfPublication;

    public Book(String name, int dateOfPublication) {
        this.name = name;
        this.dateOfPublication = dateOfPublication;


    }

    public String getName() {
        return this.name;
    }

    public int getDateOfPublication() {
        return this.dateOfPublication;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }
}

