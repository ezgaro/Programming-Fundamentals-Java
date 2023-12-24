import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        double sellPrice = Double.parseDouble(sc.nextLine());

        switch (city) {
            case "Sofia" :
                if(sellPrice <= 500) {
                    System.out.println(sellPrice*0.05);
                } else if(sellPrice <= 1000) {
                    System.out.println(sellPrice*0.07);
                } else if(sellPrice <= 10_000) {
                    System.out.println(sellPrice * 0.08);
                } else if (sellPrice > 10_000) {
                    System.out.println(sellPrice * 0.12);
                }
                break;
            case "Varna" :
                if(sellPrice <= 500) {
                    System.out.println(sellPrice*0.045);
                } else if(sellPrice <= 1000) {
                    System.out.println(sellPrice*0.075);
                } else if(sellPrice <= 10_000) {
                    System.out.println(sellPrice * 0.1);
                } else if (sellPrice > 10_000) {
                    System.out.printf("%,.2f" , (sellPrice * 0.13)); // like toFixed(2);
                }
                break;
            case "Plovdiv" :
                if(sellPrice <= 500) {
                    System.out.println(sellPrice*0.055);
                } else if(sellPrice <= 1000) {
                    System.out.println(sellPrice*0.08);
                } else if(sellPrice <= 10_000) {
                    System.out.println(sellPrice * 0.12);
                } else if (sellPrice > 10_000) {
                    System.out.println(sellPrice * 0.145);
                }
                break;
            default:
                System.out.println("error");

        }
    }
}