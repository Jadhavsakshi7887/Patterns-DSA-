import org.w3c.dom.ls.LSOutput;

//Patterns question

public class Main{
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(5);
        pattern4(5);
        pattern5(9);
        pattern6(9);
        pattern7(9);
        pattern8(7);
        pattern9(5);
        pattern10(8);
        pattern11(6);

    }
    static void pattern1(int n){
        for(int row = 1;row<=n;row++){
            for(int  col = 1;col<=n;col++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
        static void pattern3(int n){
            for(int row = 1;row<=n;row++){
                for(int  col = 1;col<=n-row;col++){
                    System.out.print("*" + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
    }
    static void pattern4(int n){
        for(int row = 1;row<=n;row++){
            for(int  col = 1;col<=row;col++){
                System.out.print(col+ " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            if (row < n / 2) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*" + " ");
                }
                System.out.println(" ");
            } else {
                for (int col = 1; col < n - row; col++) {
                    System.out.print("*" + " ");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
    static void pattern6(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<n;col++){
                if(col <= n - row){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println(" ");
    }
    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < n; col++) {
                if (col <= n - row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*"); //if you add space then it will print pattern7 half triangle
                }
            }
            System.out.println("");
        }
        System.out.println(" ");
    }
    static void pattern7(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<n;col++){
                if(col <= n - row){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println("");
        }

        for(int row = 1;row<=n;row++){
            for(int col = 1;col<n;col++){
                if(col <= row){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*" + " ");
                }
            }
            System.out.println("");
        }
        System.out.println(" ");
    }
    static void pattern9(int n) {
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<row;col++){
                    System.out.print(" ");
                }
            for (int col = 0; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
                }
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n-row;col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("");
    }

    static void pattern10(int n){
        for(int row = 1;row < n;row++){
            for(int col = 1;col<n;col++){
                int x = Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(x);
            }
            System.out.println(" ");
        }
    }
    static void pattern11(int n){


    }

}
