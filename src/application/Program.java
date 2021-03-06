package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsalInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ammount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

//        BrazilInterestService is = new BrazilInterestService(2.0);
        InterestService is = new UsalInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
