import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Clase 2
        //Punto 1:
        /*Utilizando solo tipos primitivos, String (solo usar método length),
             vectores, iteraciones simples y condicionales, genere una clase por
                  ejercicio que posea los siguientes métodos:*/

        Scanner scan = new Scanner(System.in);

        /*Ejercicio 1-Dado un String y una letra, que cuente la cantidad
        de apariciones de la letra en el String*/
//        System.out.println("-----Ejercicio 1-----");
//
//        System.out.println("A continuacion ingrese una palabra: ");
//        String palabra = scan.nextLine().toLowerCase();
//
//        System.out.println("A continuacion ingrese una letra: ");
//        char caracter = scan.next().toLowerCase().charAt(0);
//
//        Ejercicio1.conteoCaracter(palabra , caracter);
//
//        System.out.println(" ");
//
//        /*Ejercicio 2-Dados 3 números y un orden (ascendente o decreciente)
//        que  ordene los mismos y los retorne en un vector de 3.*/
//        System.out.println("-----Ejercicio 2-----");
//
//
//        System.out.println("Por favor ingrese el primer numero: ");
//        int num1= scan.nextInt();
//
//        System.out.println("Por favor ingrese el segundo numero: ");
//        int num2 = scan.nextInt();
//
//        System.out.println("Por favor ingrese el tercer numero: ");
//        int num3 = scan.nextInt();
//
//        System.out.println("Para ordenar de modo ascendente ingrese 'A', para ordenar de modo descendente ingrese 'D': ");
//        char ascDesc = scan.next().toUpperCase().charAt(0);
//        if(ascDesc == 'A'){
//            System.out.println("Este es el orden de los numeros ordenados de modo ascendente");
//            Ejercicio2.ordenarNumAsc(num1, num2, num3);
//        }else if(ascDesc == 'D'){
//            System.out.println("Este es el orden de los numeros ordenados de modo descendente: ");
//            Ejercicio2.ordenarNumDesc(num1, num2, num3);
//        }else{
//            System.out.println("La opcion ingresada no es correcta");
//        }
//
//
//
//        System.out.println(" ");
//
//        /*Ejercicio 3-Dado un vector de números, y un número X,
//        que sume todos los números > X y retorne el resultado*/
//        System.out.println("-----Ejercicio 3-----");
//
//        System.out.println("Por favor ingrese un numero: ");
//
//        int numX = scan.nextInt();
//        Ejercicio3.sumarMenor(numX);
//
//        System.out.println(" ");

        /*Ejercicio de cifrado cesar: Dado un string obtener un string
            con un desplazamiento de dos, p.*/

        System.out.println("-----Ejercicio de cifrado de Cesar-----");

        System.out.println("Por favor ingresar una palabra: ");
        String palabrita = scan.nextLine().toLowerCase();

        EjercicioCifradoCesar.cifrar(palabrita);

    }

}



