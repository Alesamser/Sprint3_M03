import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
    int c = 1;
        do{
            int n = teclat.nextInt();
            switch (n){
                case 1: System.out.println("cas1");
                break;
                case 2: System.out.println("cas2");
                break;
                case 3: System.out.println("cas3");
                break;
                default: System.out.println("Opcio incorrecta");
                c = 0;
                break;
            }
        }while(c==1);
    }
}