import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.println("Ingresa tu operación matemática: \n");
            System.out.println("1- Suma \n");
            System.out.println("2- Resta \n");
            System.out.println("3- Multiplicación \n");
            System.out.println("4- Division: \n");
            System.out.println("0 - Salir de la calculadora: \n");

            option = scan.nextInt();

            if (option != 0) {
                System.out.println("Introduce el primer digito: \n");
                int a = scan.nextInt();
                System.out.println("Introduce el segundo digito: \n");
                int b = scan.nextInt();

                switch (option) {
                    case 1:
                        Suma(a,b);
                        break;
                    case 2:
                        Resta(a,b);
                        break;
                    case 3:
                        Multiplicacion(a,b);
                        break;
                    case 4:
                        Division(a,b);
                        break;
                }
            } else {
                System.out.println("Esta saliendo de la calculadora. \n");
            }
        } while (option != 0);
    }

    public static void Suma(int a, int b){
        int resulSum = a + b;
        System.out.println("El resultado es:" + resulSum);
    };

    public static void Resta(int a, int b){
        int resulRest = a - b;
        System.out.println("El resultado es:" + resulRest);
    };

    public static void Multiplicacion(int a, int b){
        int resulMult = a * b;
        System.out.println("El resultado es:" + resulMult);
    };

    public static void Division(int a, int b){
        int resulDiv = a / b;
        System.out.println("El resultado es:" + resulDiv);
    };



}
