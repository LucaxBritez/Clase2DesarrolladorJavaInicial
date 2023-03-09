import java.util.Arrays;

public class EjercicioCifradoCesar {
    public static void cifrar(String palabraCifrar){
        char[] arrayPalabraCifrada =palabraCifrar.toCharArray();

        String abcedario = "abcdefghijklmnopqrstuvwxyz ";
        char[] arrayAbcedario = abcedario.toCharArray();

        for (int i = 0; i<palabraCifrar.length(); i++) {

            int index = abcedario.indexOf(arrayPalabraCifrada[i]);

            if(index == 25  ){
                index = 0;
            }
            if(index == 26){
                index = 1;
            }
            arrayPalabraCifrada[i] = arrayAbcedario[index + 2];


        }
        String palabraCif = String.valueOf(arrayPalabraCifrada);
        System.out.println("La palabra cifrada es: " + palabraCif);
    }
}
