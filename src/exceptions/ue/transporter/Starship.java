package exceptions.ue.transporter;

public class Starship {
    private String name;
    private Transporter transporter1;

    public Starship(String name) {
        this.name = name; //übernimmt Name
        this.transporter1 = new Transporter(); //Testverbaut, den kriege ich von außen nicht herein sprich kann ich hier initialisieren und keienr muss mitübergeben
    }
    public void beamUp(String person, String from){
        try {
            transporter1.beam(person, from, name, true);
        } catch (TransporterMalfunctionException e) { //so spezifisch wie möglich auf Exceptions reagieren
            // wir könnten auch mit catch (Excpetion e) arbeiten
            // hier können wir auf den Fehler reagieren
            System.out.println("Fehler beim Beamen, schnell wieder abbrechen!!!");
            System.out.println(e.getMessage());
            e.printStackTrace();

            //throw new SomeException(e); würde noch oben erweitert gehören
        }
        finally{
            transporter1.shutdown();
        }
    }

}
