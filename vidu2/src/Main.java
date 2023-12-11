import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[3  ][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf("Nhap phan tu hang %d cot %d la: ", row, column);
                matrix[row][column] = input.nextInt();
            }
        }
    }

}