import java.util.*;

class matrix{
    int row;
    int column;
    int mat[][];

    //constructor
    matrix(int r, int c){
        row = r;
        column = c;
        mat = new int[row][column];
    }

    void get_input(){
        Scanner s = new Scanner(System.in);
        int i = 0, j = 0;
        System.out.println("Enter the matrix elements(row wise)");
        for(i = 0; i < row; i++){
            for(j = 0; j < column; j++){
                mat[i][j] = s.nextInt();
            }
        }
    }
    void print_m(){
        int i = 0, j = 0;
        System.out.println("The matrix is: ");
        for(i = 0; i < row; i++){
            for(j = 0; j < column; j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    matrix multiply(matrix m1){
        matrix ans = new matrix(row, column);
        int i = 0, j = 0, k = 0;
        for(i = 0; i < row; i++){
            for(j = 0; j < column; j++){
                for(k = 0; k < column; k++){
                    ans.mat[i][j] += this.mat[i][k] * m1.mat[k][j];
                }
            }
        }
        return ans;
    }
}

public class Matrix{
    public static void main(String args[]){
        matrix m1, m2, ans;
        int  i = 0, j = 0, r = 0, c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        r = s.nextInt();
        System.out.println("Enter no. of columns: ");
        c = s.nextInt();

        System.out.println("\nEnter the first matrix: ");
        m1 = new matrix(r, c);
        m1.get_input();

        System.out.println("\nEnter the second matrix: ");
        m2 = new matrix(r, c);
        m2.get_input();

        ans = m1.multiply(m2);
        System.out.println("\nProduct of the two matrix is: ");
        ans.print_m();
    }
}
