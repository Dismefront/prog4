package changes;

import abstractions.MessageProcesser;
import ambient.Location;

import java.util.ArrayList;

public class ConstructedLocation {

    private ArrayList<Location> arr;

    {
        arr = new ArrayList<>();
    }

    public void makeLocationWhole(Location l1, Location ... locs)
            throws IncorrectLocationException {
        if (locs == null)
            throw new IncorrectLocationException();
        for (Location x : locs)
            if (x == null || l1 == null)
                throw new IncorrectLocationException();
        ArrayList<String> msgs = new ArrayList<>();
        this.arr.add(l1);
        for (Location x : locs) {
            this.arr.add(x);
            msgs.add(x.toString());
        }
        String msg = "К локации " + l1 +
                " добавлен(ы) " + String.join(", ", msgs);
        MessageProcesser.begin().reportCustom(msg);
    }

    public Ship getShip() {
        return new Ship(this.arr);
    }

}
