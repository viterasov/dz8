import Passangers.Passanger;
import PowerTrans.Power;
import ViewTrans.View;

public abstract class Transport {
    View view;
Passanger passanger;
Power power;
public Transport(View view,Passanger passanger,Power power){
    this.passanger =passanger;
    this.power=power;
    this.view=view;
}

}
