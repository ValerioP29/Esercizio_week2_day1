package esercizio_1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;
import  java.util.Random;


public class Esercizio1 {
    public static final Logger logger = LoggerFactory.getLogger(Esercizio1.class);
    private int[] array;

    public void randomNumber() {
        Random random= new Random();
        array = new int[5];
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(10) + 1;

        }

    }
    public void stampaArray() {
        for (int val : array) {
            System.out.println(val + " ");
        }
    }
  public void esegui() {
        Scanner scanner = new Scanner(System.in);
        randomNumber();
      System.out.print("Array iniziale: ");
      stampaArray();

      while (true) {
      try{
          System.out.println("Scegliere una posizione (0-4): ");
          int pos = scanner.nextInt();

          System.out.println("Inserisci un valore da 1 a 10 o 0 per uscire: ");
          int numero = scanner.nextInt();

          if (numero==0){
              System.out.println("Uscita dal programma");
              break;
          }
          if (numero < 1 || numero >10){
              System.out.println("Errore: il numero non è compreso tra 1 e 10.");
          }
          array[pos] = numero;
          System.out.println("Nuovo array: ");
          stampaArray();
      }
      catch (ArrayIndexOutOfBoundsException e) {
              logger.error("Indice non valido.");
      } catch (Exception e) {
         logger.error("errore generico. ", e);
          System.out.println("input non valido, riprova.");
          scanner.nextLine();
      }
      }
      }
  }



