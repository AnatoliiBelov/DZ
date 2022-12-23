package homework1;

public class Author {
    private String firstName;
    private String lastname;

    public Author(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}
