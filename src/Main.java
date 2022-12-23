import Passangers.PassBus;
import Passangers.PassSedan;
import Passangers.PassTrack;
import PowerTrans.PowerBus;
import PowerTrans.PowerSedan;
import PowerTrans.PowerTrack;
import ViewTrans.BusView;
import ViewTrans.SedanView;
import ViewTrans.TrackView;

public class Main {
    public static void main(String[] args) {
        BusView busview =new BusView();
        PassBus passbus =new PassBus();
        PowerBus powerbus = new PowerBus();

        Bus bus = new Bus(busview,passbus,powerbus);

        SedanView sedanview =new SedanView();
        PassSedan passsedan =new PassSedan();
        PowerSedan powersedan = new PowerSedan();

        Sedan sedan = new Sedan(sedanview, passsedan, powersedan);


        TrackView trackView =new TrackView();
        PassTrack passtrack =new PassTrack();
        PowerTrack powertrack = new PowerTrack();

        Track track =new Track(trackView,powertrack,passtrack);

        System.out.println(bus.passanger.capacityPass());
        System.out.println(bus.power.powerEngin());
        System.out.println(bus.view.colorTrans());
        System.out.println();

        System.out.println(sedan.passanger.capacityPass());
        System.out.println(sedan.power.powerEngin());
        System.out.println(sedan.view.colorTrans());
        System.out.println();

        System.out.println(track.passanger.capacityPass());
        System.out.println(track.power.powerEngin());
        System.out.println(track.view.colorTrans());






    }
}
