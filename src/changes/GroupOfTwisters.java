package changes;

import abstractions.MessageProcesser;
import characters.Twister;

public class GroupOfTwisters extends Twister {

    public GroupOfTwisters() {
        this.name = "Крутильщики";
    }

    public void undress() {
        MessageProcesser.begin().reportCustom(this.toString() + " разделись, но " +
                "даже это не приносило им облегчения");
    }

    @Override
    public void pump() {
        MessageProcesser.begin().reportCustom(this.toString() +
                " откачивают воду");
    }

    @Override
    public void pullTrigger() {
        MessageProcesser.begin().reportCustom(this + " изо всех сил" +
                " нажимают руками на рычаги, соединенные с осью, тем самым" +
                " приводя во вращение ось вместе с укрепленным на ней диском");
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
