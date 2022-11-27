package samost.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        int sum = 0;
        while (!isExit) {
            int x = scanner.nextInt();
            
            sum = sum + x;
            System.out.println(sum);
            String s = scanner.nextLine();
            isExit = s.equals("EXIT");
        }
    }
}
