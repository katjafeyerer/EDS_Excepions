package exceptions.ue.transporter;

public class Transporter {
    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {
        System.out.println("Beaming person " + person + " from " + from + " to " + to);
        if(urgent/*==true*/){
            if(Math.random() > 0.5){
                throw new TransporterMalfunctionException("Error on beaming "
                        + person + " from " + from + " to " + to);
                // dadurch kann man den Code absichern, man muss nicht mehr davon ausgehen, dass die Leute die Doku ansehen
            }

        }
        // ist genau das gleiche wie: if(urgent && Math.random() > 0.5){}

    }

    public void shutdown(){
        System.out.println("Transporter shutting down ...");
    }
}
