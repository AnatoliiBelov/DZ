package homework1;


public class Main {
    public static void main(String[] args) {
        Author warAndPiece = new Author("Лев ", "Толстой");
        System.out.println(warAndPiece.firstName + warAndPiece.lastname);
        warAndPiece.setFirstName("ЛЕВ ");
        System.out.println(warAndPiece.firstName + warAndPiece.lastname);

        task1();
    }

    public static void task1() {
        Book warAndPiece = new Book("War and Piece", 1757);
        System.out.println("warAndPiece.name = " + warAndPiece.getName());
        System.out.println("warAndPiece.dateOfPublication = " + warAndPiece.getDateOfPublication());
        warAndPiece.setName("WAR AND PIECE");
        System.out.println("warAndPiece.getName() = " + warAndPiece.getName());


    }

}