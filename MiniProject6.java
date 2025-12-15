import java.util.Scanner;
public class MiniProject6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Matrices

        int rows;
        int columns;
        char symbol;

        System.out.print("the # of rows: ");
        rows = scanner.nextInt();
        System.out.print("the # of columns: ");
        columns = scanner.nextInt();
        System.out.print("what is the symbol: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
        }
        scanner.close();
    }
}




