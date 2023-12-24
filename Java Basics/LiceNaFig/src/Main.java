import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String figureName = sc.nextLine();
        if(figureName.equals("square")) {
            int a = Integer.parseInt(sc.nextLine());
            System.out.println(a*a);
        } else if(figureName.equals("triangle")){
            int a = Integer.parseInt(sc.nextLine());
            int h = Integer.parseInt(sc.nextLine());
            System.out.println(a*h/2);
        }
    }
}