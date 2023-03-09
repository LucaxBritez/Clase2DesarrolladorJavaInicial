public class Ejercicio3 {

    public static void sumarMenor(int a){
        int arrayNum[] = {1, 2 ,8 , 9 , 15 , 22 , 13 , 12};
        int suma = 0;

        for (int i = 0; i < arrayNum.length; i++){
            if(a < arrayNum[i]){
                suma = suma + arrayNum[i];
            }
        }
        System.out.println("La suma de todos los numeros mayores a " + a + " da como resultado: " + suma);
    }
}
