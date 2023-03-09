public class Ejercicio2 {
    public static void ordenarNumAsc(int a, int b, int c) {

        int[] arrayOrd = new int[3];


        if (a <= b && a <= c) {
            arrayOrd[0] = a;
        }else if(a >= b && a <= c || a <= b && a >= c){
            arrayOrd[1] = a;
        }else if(a >= b && a >= c){
            arrayOrd[2] = a;
        }

        if(b <= a && b <= c){
            arrayOrd[0] = b;
        }else if(b >= a && b <=c ||b <= a && b >=c){
            arrayOrd[1] = b;
        }else if(b >= a && b >= c){
            arrayOrd[2] = b;
        }

        if(c <= a && c <= b){
            arrayOrd[0] = c;
        }else if(c >= a && c <= b||c <= a && c >= b){
            arrayOrd[1] = c;
        }else if(c >= a && c >= b){
            arrayOrd[2] = c;
        }
        for(int i : arrayOrd) {
            System.out.println(i);
        }
    }



    public static void ordenarNumDesc(int a, int b, int c) {

        int[] arrayOrd = new int[3];


        if (a <= b && a <= c) {
            arrayOrd[2] = a;
        }else if(a >= b && a <= c || a <= b && a >= c){
            arrayOrd[1] = a;
        }else if(a >= b && a >= c){
            arrayOrd[0] = a;
        }

        if(b <= a && b <= c){
            arrayOrd[2] = b;
        }else if(b >= a && b <=c ||b <= a && b >=c){
            arrayOrd[1] = b;
        }else if(b >= a && b >= c){
            arrayOrd[0] = b;
        }

        if(c <= a && c <= b){
            arrayOrd[2] = c;
        }else if(c >= a && c <= b||c <= a && c >= b){
            arrayOrd[1] = c;
        }else if(c >= a && c >= b){
            arrayOrd[0] = c;
        }

        for(int i : arrayOrd) {
            System.out.println(i);
        }
    }
}
