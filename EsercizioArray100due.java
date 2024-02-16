import java.util.Scanner;
import java.util.Random;
public class EsercizioArray100due {
  public static void main(String[] args) {
    // Inizializzazione
    Scanner in = new Scanner(System.in);
    int[] array;
    int grandezza;
    System.out.println("Ciao!");
    System.out.println("Quanti numeri vuoi inserire nell'array?");
    System.out.println("");
    
    grandezza = in.nextInt();
    array = new int[100];
    // Menu 
    while (true) {
      System.out.println("");
      System.out.println("  |-| MENU |-| ");
      System.out.println("");
      System.out.println("1. Caricamento tastiera");
      System.out.println("2. Caricamento random");
      System.out.println("3. Visualizzazione");
      System.out.println("4. Inserimento in posizione");
      System.out.println("5. Cancellazione di un elemento cercato");
      System.out.println("6. Esci");
      System.out.println("");
      System.out.println("Seleziona un'opzione:");
      System.out.println("");
      
      int opzione = in.nextInt();
      // Elaborazione 
      // Caricamento tastiera
      if (opzione == 1) {
        for (int i = 0; i < grandezza; i++) {
          System.out.println("");
          System.out.println("Inserisci il " + (i + 1) + "° numero:");
          array[i] = in.nextInt();
        }
      // Generazione casuale
      } else if (opzione == 2) {
        Random random = new Random();
        for (int i = 0; i < grandezza; i++) {
          array[i] = random.nextInt(50) + 1;
          System.out.println("");
          System.out.println("Array riempito con numeri casuali.");
          System.out.println("");
        }
      // Visualizzazione contenuti
      } else if (opzione == 3) {
        System.out.println("");
        System.out.println("Numeri nell'array:");
        System.out.println("");
        for (int i = 0; i < grandezza; i++) {
          System.out.println(array[i] + " ");
        }
        System.out.println();
        
      // Inserimento in posizione
      } else if (opzione == 4) {
        System.out.println("Inserisci la posizione in cui vuoi inserire il numero:");
        int posizione = in.nextInt();
        if (posizione >= 0 && posizione < grandezza) {
          for (int i = grandezza; i > posizione; i--) {
            array[i] = array[i-1];
          }
          System.out.println("Inserisci il numero da aggiungere:");
          int numero = in.nextInt();
          array[posizione] = numero;
          grandezza++;
          System.out.println("");
          System.out.println("Numero aggiunto con successo.");
          System.out.println("");
        } else {
          System.out.println("Posizione non valida.");
        }
      
      // Cancellazione di un elemento cercato
      } else if (opzione == 5) {
        System.out.println("Inserisci la posizione dell'elemento da cancellare:");
        int posizione1 = in.nextInt();
        if (posizione1 >= 0 && posizione1 < grandezza) {
          for (int i = posizione1; i < grandezza - 1; i++) {
            array[i] = array[i + 1];
          }
          grandezza--;
          System.out.println("");
          System.out.println("Elemento cancellato.");
          System.out.println("");
        } else {
          System.out.println("");
          System.out.println("Posizione non valida.");
          System.out.println("");
        }
      // Chiusura
      } else if (opzione == 6) {
        System.out.println("");
        System.out.println("Programma in chiusura...");
        break;
      }
    }
  }
}
