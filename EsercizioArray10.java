public class EsercizioArray10 {
    public static void main(String[] args) {
        
        int[] array1 = {3, 7, 2, 8, 5, 1, 6, 4, 9, 0};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int prodotto = 0;
        
        for (int i = 0; i < 10; i++) {
            prodotto += array1[i] * array2[i];
        }
        System.out.println("Il prodotto scalare è: " + prodotto);
    
    }
}
