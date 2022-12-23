package homework1;


public class Main {
    public static void main(String[] args) {

        Book warAndPiece = new Book("War and Piece", 1957, "Лев Толстой");
        Book nervousPeople = new Book("Тревожные люди", 2022, "Фредерик Бакман");
        System.out.println(nervousPeople);
        System.out.println(warAndPiece);
        warAndPiece.setDateOfPublication(2000);
        System.out.println(warAndPiece);
        System.out.println(warAndPiece.hashCode());


    }

}