package at.ran.OO.Remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    private List<Battery>batteries;

    public void RemoteBattery(Battery battery){
        this.batteries.add(battery);
    }

    public Remote(){
        this.batteries = new ArrayList<>();
    }

    public void turnOn(){
        int chargingStatus1 = this.batteries.get(0).getChargingStatus();
        int chargingStatus2 = this.batteries.get(1).getChargingStatus();

        this.batteries.get(0).setChargingStatus(chargingStatus1 - (chargingStatus1 * 5/100));
        this.batteries.get(1).setChargingStatus(chargingStatus2 - (chargingStatus2 * 5/100));

        int newChargingStatus1 = this.batteries.get(0).getChargingStatus();
        int newChargingStatus2 = this.batteries.get(1).getChargingStatus();

        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

}
