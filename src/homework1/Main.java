package homework1;


public class Main {
    public static void main(String[] args) {

        Book warAndPiece = new Book("War and Piece", 1757, "Лев Толстой");
        System.out.println("warAndPiece.name = " + warAndPiece.getName());
        System.out.println("warAndPiece.dateOfPublication = " + warAndPiece.getDateOfPublication());
        warAndPiece.setName("WAR AND PIECE");
        System.out.println("warAndPiece.getName() = " + warAndPiece.getName());

        System.out.println(warAndPiece);
        System.out.println(warAndPiece.hashCode());


    }

}