import java.util.Scanner;

public class Persona {

    Scanner scanner = new Scanner(System.in);
    String nome;
    String cognome;
    String luogo;
    int scelta_cinema;
    String risposta;
    int data_prenotazione;
    String film;

    public void set_nome(){
        System.out.println("Come ti chiami?");
        nome = scanner.nextLine();
    }
    public void set_cognome() {
        System.out.println("Qual è il tuo cognome?");
        cognome = scanner.nextLine();
    }
    public void Informazioni() {
        System.out.println("Benvenuto "+nome+" "+cognome+", questo è un software per cercare" +
                " una sala cinema secondo le sue esigenze.");
    }
    public void set_luogo() {
        System.out.println("Inserisci il nome della città nella quale abiti.");
        luogo = scanner.nextLine();
    }
    public void cinema_vicinanze() {
        System.out.println("Cerco cinema nelle vicinanze...");
        scanner.nextLine();
        if (luogo.equals("Roma")) {
            System.out.println("Nelle vicinanze vi è il cinema \"Space Cinema\" e il cinema \"Nuovo Olimpia\".");
        }
        else {
            System.out.println("Spiacenti, ma in questa zona non sono presenti cinema. Riprova per esempio con Roma.");
            System.exit(0);
        }
    }
    public void scelta_cinema() {
        System.out.println("Scrivi \"1\" se vuoi informazioni su \"Space Cinema\", scrivi \"2\" per \"Nuovo Olimpia\" o scrivi un altro numero per uscire.");
        scelta_cinema = scanner.nextInt();
        if (scelta_cinema == 1) {
            System.out.println("Il cinema \"Space Cinema\" è aperto ogni giorno tranne il lunedì, è aperto dalle ore 09:00 alle ore 18:30.");
        }
        if (scelta_cinema == 2) {
            System.out.println("Il cinema \"Nuovo Olimpia\" è aperto tutti i giorni, dalle ore 10:00 alle ore 17:30.");
        }
        if (scelta_cinema != 1 && scelta_cinema != 2) {
            System.out.println("Arrivederci!");
            System.exit(0);
        }

    }
    public void prenotazione() {
       scanner.nextLine();
        if (scelta_cinema == 1) {
            System.out.println("Vuoi prenotare una sala? Rispondi solo con \"Si\" o con \"No\".");
            risposta = scanner.nextLine();
                if (risposta.equals("Si")) {
                    System.out.println("Benissimo, scrivi un giorno valido per la tua prenotazione.");
                    data_prenotazione = scanner.nextInt();
                        if (data_prenotazione < 1 || data_prenotazione> 31) {
                            System.out.println("Data non valida, arrivederci.");
                            System.exit(0);
                        }
                }
                else {
                    System.out.println("Arrivederci");
                    System.exit(0);
                }
        }
        if (scelta_cinema == 2) {
            System.out.println("Vuoi prenotare una sala? Rispondi con \"Si\" o con \"No\".");
            risposta = scanner.nextLine();
                 if (risposta.equals("Si")) {
                System.out.println("Benissimo, scrivi il giorno del mese per la tua prenotazione.");
                data_prenotazione = scanner.nextInt();
                  }
                 else {
                System.out.println("Arrivederci");
                System.exit(0);
            }
        }
    }
    public void scelta_film() {
       scanner.nextLine();
        if (scelta_cinema== 1) {
            System.out.println("Scegli tra uno dei film disponibili, ovvero tra: \"Godzilla vs Kong\",\"Interstellar\",\"Tenet\",\"Inseption\".");
            film = scanner.nextLine();
            System.out.println("Perfetto, hai scelto il film: \""+film+"\". Ci vediamo il "+data_prenotazione+" "+nome+" "+cognome+"!");
        }
        if (scelta_cinema == 2) {
            System.out.println("Scegli tra uno dei film disponibili, ovvero tra: \"Sole a Catinelle\",\"Passengers\",\"Titanic\",\"Revenant\".");
            film = scanner.nextLine();
            System.out.println("Perfetto, hai scelto il film:\""+film+"\". Ci vediamo il "+data_prenotazione+" "+nome+" "+cognome+"!");
        }
    }
}
