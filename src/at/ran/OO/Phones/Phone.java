package at.ran.OO.Phones;

import java.util.Date;
import java.util.List;

public class Phone {
    private SDCard card;
    private Sim sim;
    private Camera camera;

    public Phone() {

    }

    public void makePicture(){
        if (this.card == null || this.card.getFreeSpace()<100){
            System.out.println("Kein Platz oder keine Karte");
            return;
        }
        PhoneFile file = this.camera.makePicture(Camera.size.LARGE);
        file.setName("picture-" + (new Date()).getTime());
        file.setExtension("jpg");
        card.saveFile(file);
    }

    public void printAllFiles(){
        List<PhoneFile> files = this.card.getFiles();
        for (PhoneFile file : files){
            System.out.println(file.getInfo);
        }
    }

    public void doCall(String number){
        if (sim == null) {
            System.out.println("No SIM card!");
            return;
        }
        sim.makeCall(number);
    }

    public SDCard getCard() {
        return card;
    }

    public void setCard(SDCard card) {
        this.card = card;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
