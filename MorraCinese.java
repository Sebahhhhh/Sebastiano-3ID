import java.util.Scanner;
public class MorraCinese {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        System.out.println("Giocatore 1: Inserisci forbice, carta o pietra:");
        char[] input1 = System.console().readPassword();
        String g1 = new String(input1);
        System.out.println("Giocatore 2: Inserisci forbice, carta o pietra:");
        String g2 = in.next();
        if (g1.equals("forbice") && g2.equals("carta") || 
            g1.equals("carta") && g2.equals("pietra") || 
            g1.equals("pietra") && g2.equals("forbice")) {
          
            System.out.println("Il vincitore è: ");
            System.out.println("");
            System.out.println("GIOCATORE 1!");
          
        } else if (g2.equals("forbice") && g1.equals("carta") || 
                   g2.equals("carta") && g1.equals("pietra") || 
                   g2.equals("pietra") && g1.equals("forbice")) {
                   System.out.println("Il vincitore è: ");
                   System.out.println("");
                   System.out.println("GIOCATORE 2!");
          
        } else {
            System.out.println("Parola non valida. Inserire una delle seguenti opzioni:");
            System.out.println("Carta:");
            System.out.println("Forbice:");
            System.out.println("Pietra:");
        }
    }
}
