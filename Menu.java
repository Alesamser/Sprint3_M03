import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String agenda[]; //Array per a guardar els cognoms
        final int TAMANY = 20; //Tamany de l'array
        agenda = new String[TAMANY]; //Assignar el tamany a l'array
        int nAlumnes = 0; //Numero d'alumnes
        Scanner teclat = new Scanner(System.in);
        int c = 1; //Variable per a sortir del menu
            //Bucle per a poder treballar sense que s'esborrin les dades fins que no sortim del menu
            do{
                //Mostrem per pantalla les opcions que té l'usuari
                System.out.println("Tria una opció:\n1-Inserir 2-Localitzar 3-Recuperar 4-Suprimir \n5-SuprimirDada 6-Anul·lar 7-PrimerDarrer 8-Imprimir \n9-Ordenar 10-Sortir");
                int n = teclat.nextInt(); //Variable que llegeix l'opció triada
                switch (n){
                    case 1: System.out.println("Inserir");
                        
                    if (nAlumnes == TAMANY){
                    System.out.println("La llista esta plena");
                        
                    }else if (nAlumnes < TAMANY) {
                    System.out.println("introdueix la posicio del array");
                    int posicioInsertar = teclat.nextInt();

                    System.out.println("introdueix el cognom a introduir");
                    String cognom = teclat.next();

                    for (i=nAlumnes; i>posicioInsertar; i--)
                        agenda[i] = agenda[i-1];
                        agenda[posicioInsertar] = cognom;
                        nAlumnes++;

                    } 

                    System.out.println("llista actualitzada");
                    for (i=0; i<nAlumnes; i++)
                            System.out.println(agenda[i]);
                    
                    break;
                    case 2: 
                    if(nAlumnes==0){
                        System.out.println("No hi ha cap element en la llista");
                    }else{
                        String nombuscar=teclat.next();
                        Boolean noTrobat=true;    
                        for(int i=0;i<nAlumnes;i++){
                             if(nombuscar.compareTo(agenda[i])==0){
                                noTrobat=false;
                                System.out.println(nombuscar + " és troba en la posició "+ (i+1));
                                }
                        }
                        if(noTrobat){ 
                         System.out.println("No hi ha cap nom com aquest");
                        }
                    }
                    break;
                    case 3:
                        if (nAlumnes!=0){
                        System.out.println("Introdueix la posició ");
                        int p = teclat.nextInt();
                            if (p<nAlumnes || p<=0){    
                                System.out.println(agenda[p-1]);
                            }
                            else{
                                System.out.println("Posició no valida.");
                            }
                        }
                    break;
                    case 4: 
                        /*
                        Entrada --> Posició, agenda, nAlumnes 
                        Sortida --> agenda, nAlumnes
                        L'operació de suprimir suprimeix el cognom que hi hagi en la posició que introdueixi l'usuari
                        */ 
                        //Comprovem que hi ha alumnes a la llista
                        if (nAlumnes!=0){
                        System.out.println("Introdueix una posició.");
                        int p = teclat.nextInt();   //Variable de posició
                            //Comprovem que la posició sigui valida
                            if (p>nAlumnes || p<=0){
                                System.out.println("Posició no valida.");
                            }
                            /*
                            Demana confirmació per a esborrar i en cas de una resposta positiva 
                            esborra l'alumne que hi ha a la posició triada 
                            */ 
                            else {
                                System.out.println("Estàs segur/a que vols eliminar l'alumne de la posició "+p+"?\n1 Per a sí       2 Per a no");
                                int o = teclat.nextInt(); //Variable que guarada l'opció
                                //Comprova l'opció triada, si és positiva  fa el borrat i en cas contrari canel·la el borrat
                                if (o==1){
                                    if (nAlumnes<TAMANY){
                                        //Bucle que reorganitza l'array
                                        for (int i = p-1;i<nAlumnes;i++){
                                            agenda[i]=agenda[i+1];
                                        }
                                    }
                                    nAlumnes--;
                                    System.out.println("Alumne de la posició "+p+" borrat amb exit.");
                                    System.out.println("Llista actualitzada:");
                                    //Imprimim la llista despres del borrat
                                    for(int i = 0; i<nAlumnes;i++){
                                        System.out.println(agenda[i]);
                                    }
                                }
                                else{
                                    System.out.println("Borrat de la posició "+p+" cancel·lat.");
                                }
                            }
                        }
                        else{
                            System.out.println("No hi ha alumnes a la llista.");
                        }
                    break;
                    case 5: 
                        if (nAlumnes!=0){
                            System.out.println("Quin alumne vols suprimir?");
                            String cognomABorrar = teclat.nextLine();
            
                            System.out.println("Estàs segur/a que vols eliminar l'alumne "+cognomABorrar+"?\n1 Per a sí       2 Per a no");
                            int borrar = teclat.nextInt();
            
                            if (borrar==1){
                                for (int x = 0; x <nAlumnes ; x++)
                                {
                                    if  (cognomABorrar.compareTo(agenda[x])==0) 
                                    {                           
                                        if ((x+1)<nAlumnes){
                                            for (int i = x;i<(nAlumnes-1);i++){
                                                agenda[i]=agenda[i+1];
                                            }
                                        }
                                        nAlumnes--;            
                                    }
                                }
                                System.out.println( "\nLa llista actualitzada es:\n");
            
                                for(int i = 0; i<nAlumnes;i++){
                                System.out.println(agenda[i]);
                                }
                            }
                            else {
                                System.out.println("No se borrara el alumne");
            
                            }               
                        }  
            
                        else {
                            System.out.println("No hi han alumnes");
                        }
                    break;
                    case 6:
                        System.out.println("Estas segur de borrar la llista? True/False");
                        Boolean Segur=teclat.nextBoolean();
                        if(Segur){
                            nAlumnes=0;
                        }
                    break;
                    case 7: 
                        System.out.println("Vols sapiguer la primera o ultima persona? P/U");
                        String posicio=teclat.next();
                        if(posicio.compareTo("P")==0){
                            System.out.println(agenda[0]);
                        }else if(posicio.compareTo("U")==0){
                            System.out.println(agenda[nAlumnes-1]);
                        }
                    break;
                    case 8:
                        if (nAlumnes!=0){
                            for (int i=0; i<nAlumnes ; i++){
                                System.out.println("La posició " + (1+i) + " perteneix a : " + agenda[i]);
                            }
                        }
                    break;
                    case 9: 
                        /*
                        Entrada --> agenda
                        Sortida --> agenda ordenada
                        El programa ordena lexicograficament els alumnes que hi hagi a la llista 
                        */
                        //Comprevem si hi ha suficicents alumnes a la llista per a ordenar en cas contrari informa a l'usuari
                        if (nAlumnes>1 ){
                            //Array on guardarem la nova posició dels cognoms
                            String memoria[]; 
                            memoria = new String[nAlumnes];
                            int contador; //Variable on guardarem el numero de cops que uns cognoms van abans lexicograficament 
                            //Comparem cada cognoms amb la resta per a veure en quina posició hauria d'estar, i despés els guarda a la memoria a la posició correcta
                            for (int i=0; i<nAlumnes; i++){
                                contador=0;
                                for (int j=0; j<nAlumnes; j++){
                                    int res = agenda[j].compareTo(agenda[i]);
                                    if (res<0){
                                        contador++;
                                    }
                                }
                                memoria[contador] = agenda[i];
                            }
                            //Pasem el nou ordre a la array principal
                            for(int i = 0; i<nAlumnes; i++){
                                agenda[i] = memoria[i];
                            }
                            //Mostrem el resultat final
                            System.out.println("Llista ordenada:");
                            for(int i = 0; i<nAlumnes; i++){
                                System.out.println(agenda[i]);
                            }
                        }
                        else{
                            System.out.println("No hi ha cap o sufucients alumnes a la llista.");
                        }
                    break;
                    case 10: System.out.println("Sortint del programa");
                    c=0;
                    break;
                    default: System.out.println("Opcio incorrecta");
                    break;
                }
            }while(c==1);
    }
}
