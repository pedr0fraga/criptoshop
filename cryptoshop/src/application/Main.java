package application;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double bitcoinPrice = 387720.00;
        double ethereumPrice = 15036.72;
        double solanaPrice = 889.27;
        double xrpPrice = 3.10;
        double dogePrice = 0.82;

        System.out.print("How much do you want to spend? ");
        double budget = sc.nextDouble();
        
        double bitcoinTotal = budget / bitcoinPrice;
        double ethereumTotal = budget / ethereumPrice;
        double solanaTotal = budget / solanaPrice;
        double xrpTotal = budget / xrpPrice;
        double dogeTotal = budget / dogePrice;
        
        System.out.println("You can buy:");
        System.out.printf("Bitcoin = %.5f%n", bitcoinTotal);
        System.out.printf("Ethereum = %.5f%n", ethereumTotal);
        System.out.printf("Solana = %.5f%n", solanaTotal);
        System.out.printf("XRP = %.5f%n", xrpTotal);
        System.out.printf("Dogecoin = %.5f%n", dogeTotal);
        
        sc.close();
    }
}

