import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Controlador controlador = new Controlador();
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;

        System.out.println("Que arbol desea utilizar para ejecutar el programa?");
        System.out.println("1. Red Black Tree");
        System.out.println("2. Splay Tree");
        opcion = scan.nextInt();
        controlador.escogerArbol(opcion);

        System.out.println("Cargando Diccionario...");
        controlador.insetarPalabras();
        controlador.obtenerOracion();

        while(opcion2 != 2){
            System.out.println("------Menu Diccionario------");
            System.out.println("1. Traducir oracion del archivo texto.txt");
            System.out.println("2. Salir");

            opcion2 = scan.nextInt();

            switch(opcion2){

                case 1:
                System.out.println("Traduciendo... \n");
                controlador.traducirOracion();
                System.out.println("\n \n");
                break;

                case 2:
                System.out.println("Feliz dia");
                break;

                default:
                System.out.println("Opcion no valida");
                break;
            }
        }


    }
}