public class Chap5_ex519 {

    public static void main(String[] args) {
        int i = 1, j = 2, k = 3, m = 2;

        System.out.println(i == 1);
        // true

        System.out.println(j == 3);
        //false

        System.out.println((i >= 1) && (j < 4));
        //true

        System.out.println((m <= 99) & (k < m));
        //false

        System.out.println((j >= i) || (k == m));
        //true

        System.out.println((k + m < j) | (3 - j >= k));
        //false
        System.out.println(!(k > m));
        //false


    }
}