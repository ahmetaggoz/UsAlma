package RecursiveMethods;

import java.util.Scanner;

public class UsAlma  {

    static int usal(int T, int U){
        if(U == 0)
            return 1;
        return T * usal(T, (U-1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini girin :");
        int T = scanner.nextInt();
        System.out.print("Üs değerini girin :");
        int U = scanner.nextInt();
        System.out.println(usal(T, U));
    }
}
