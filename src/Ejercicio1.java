public class Ejercicio1 {
    public static void conteoCaracter(String palabra , char caracter){
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("La palabra ingresada es: " + palabra);
        System.out.println("La letra ingresada es: " + caracter);
        System.out.print("Veces en que aparece la letra " + caracter + " en la palabra " + palabra +": " + contador);

    }
}
