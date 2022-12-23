package Passangers;

import Passangers.Passanger;

public class PassTrack implements Passanger {
    @Override
    public String capacityPass() {
        return "Вместимость грузовика 2 пассажира";
    }
}
