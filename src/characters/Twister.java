package characters;

import abstractions.Customed;
import abstractions.MessageProcesser;
import ambient.Location;

public class Twister extends Character {

    public Twister() {
        this.name = "Крутильщик";
    }

    @Override
    public void pump() {
        MessageProcesser.begin().reportCustom(this
                + " откачивает воду");
    }

    @Override
    public void chill(Location loc) {
        MessageProcesser.begin().reportCustom(this
                + " отдыхает на " + loc.toString());
    }

    @Override
    public void pullTrigger() {
        MessageProcesser.begin().reportCustom(this + " нажимает на рычаги");
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
