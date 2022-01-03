package changes;

import abstractions.MessageProcesser;
import ambient.Location;

import java.util.ArrayList;

public class Ship extends Location {

    ArrayList<Location> locs;

    public Ship(ArrayList<Location> locs) {
        this.locs = locs;
    }

    public void swim() {
        check();
        String msg = "Лохань, прикрытая сверху диском, погружалась " +
                "больше чем наполовину в воду, так что ее почти и видно-то" +
                " не было. Со стороны казалось, что огромнейший деревянный " +
                "диск как бы сам собой крутится над водой.";
        MessageProcesser.begin().reportCustom(msg);
    }

    public void check() {
        boolean c1 = false, c2 = false;
        for (Location x : this.locs) {
            if (x.toString() == "Чертово Колесо")
                c1 = true;
            if (x.toString() == "Лоханка")
                c2 = true;
        }
        if (!(c1 && c2))
            throw new LocationUnbuiltException();
    }

}
