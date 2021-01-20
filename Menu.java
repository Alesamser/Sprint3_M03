import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
    String agenda[]; //Array per a guardar els cognoms
    final int TAMANY = 20; //Tamany de l'array
    agenda = new String[tamany]; //Assignar el tamany a l'array
    int nAlumnes = 0; //Numero d'alumnes
    agenda[0]= "Muñoz López";
    agenda[1]= "Carrillo López";
    agenda[2]= "Gomez López";
    agenda[3]= "Muñoz Alonso";
    nAlumnes = 4;
    System.out.println("Tria una opció:\n1-Inserir 2-Localitzar 3-Recuperar 4-Suprimir \n5-SuprimirDada 6-Anul·lar 7-PrimerDarrer 8-Imprimir \n9-Ordenar 10-LocalitzarEnOrdenada 11-SuprimirDadaEnOrdenada 12-Sortir");
    Scanner teclat = new Scanner(System.in);
    int c = 1;
        do{
            int n = teclat.nextInt();
            switch (n){
                case 1: System.out.println("Inserir");
                break;
                case 2: System.out.println("Localitzar");
                break;
                case 3: System.out.println("Recuperar");
                break;
                case 4: System.out.println("Suprimir");
                break;
                case 5: System.out.println("SuprimirDada");
                break;
                case 6: System.out.println("Anul·lar");
                break;
                case 7: System.out.println("PrimerDarrer");
                break;
                case 8: System.out.println("Imprimir");
                break;
                case 9: System.out.println("9-Ordenar");
                break;
                case 10: System.out.println("LocalitzarEnOrdenada");
                break;
                case 11: System.out.println("SuprimirDadaEnOrdenada");
                break;
                case 12: System.out.println("Sortint del programa");
                c=0;
                break;
                default: System.out.println("Opcio incorrecta");
                break;
            }
        }while(c==1);
    }
}
