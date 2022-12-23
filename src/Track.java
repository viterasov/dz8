import Passangers.PassTrack;
import Passangers.Passanger;
import PowerTrans.Power;
import PowerTrans.PowerTrack;
import ViewTrans.TrackView;
import ViewTrans.View;

public class Track extends Transport{
    public Track(TrackView trackView, PowerTrack powerTrack, PassTrack passTrack) {
        super((View) trackView, (Passanger) passTrack, (Power) powerTrack);
    }
}
