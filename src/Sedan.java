import Passangers.PassSedan;
import Passangers.Passanger;
import PowerTrans.Power;
import PowerTrans.PowerSedan;
import ViewTrans.SedanView;
import ViewTrans.View;

public class Sedan extends Transport{
    public Sedan(SedanView sedanView, PassSedan passSedan, PowerSedan powerSedan) {
        super(sedanView,passSedan,powerSedan);
    }
}
