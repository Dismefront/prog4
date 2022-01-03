package characters;

import abstractions.MessageProcesser;
import ambient.Location;

public class Ponchik extends Twister {

    public Ponchik() {
        this.name = "Пончик";
    }

    public void lay() {
        MessageProcesser.begin().reportCustom(this.toString() +
                " растянулся на койке");
    }

    public void eat() {
        MessageProcesser.begin().reportCustom(this.toString() +
                " пошел чего-нибудь пожевать. Но даже еда не доставляла" +
                " ему прежнего удовольствия");
    }

    public void chill(Location loc) {
        MessageProcesser.begin().reportCustom(this.toString()
                + " вертится на " + loc.toString());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
