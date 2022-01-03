package ambient;

import abstractions.MessageProcesser;
import characters.Character;

public class EventManager {

    static boolean floodFlag;

    {
        floodFlag = false;
    }

    public static void createFlood(Location loc) {
        floodFlag = true;
        MessageProcesser.begin().reportCustom(
                "Вода проникает сквозь щели в досках и заливает " +
                        loc.toString()
        );
    }

    public static void fightEventWithCharacter(Character ch) {
        if (floodFlag)
            ch.pump();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void createPleasuringEvent(Character ch, Pleasurable pl) {
        pl.apply(ch);
    }

}
