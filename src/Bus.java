import Passangers.PassBus;
import Passangers.Passanger;
import PowerTrans.Power;
import PowerTrans.PowerBus;
import ViewTrans.BusView;
import ViewTrans.View;

public class Bus extends Transport{
    public Bus(BusView busview, PassBus passbus, PowerBus powerbus) {
        super((View) busview, (Passanger) passbus,(Power) powerbus);
    }
}
