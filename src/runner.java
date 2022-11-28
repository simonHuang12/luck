import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want default settings? (y/n)");
        String defaultSet = input.nextLine();
        for (int i = 0; i < 100; i++){
            int random = (int)(Math.random()*100+1);
            System.out.println(random);

        }


    }
}
