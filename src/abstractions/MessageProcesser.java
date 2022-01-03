package abstractions;

import ambient.Location;
import characters.Character;

public class MessageProcesser implements Created, Customed {

    private MessageProcesser() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private static MessageProcesser example;

    static {
        example = null;
    }

    public static MessageProcesser begin() {
        return MessageProcesser.begin(1000);
    }

    public static MessageProcesser begin(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if (example == null)
            example = new MessageProcesser();
        return example;
    }

    @Override
    public void notifyOnCreation(Object obj) {
        System.out.println("Объект " + obj.toString() + " Создан");
    }

    private void notifyLocationConditions(Location loc) {
        System.out.println("На локации " + loc.toString() + " " + loc.getConditionDescriptions());
    }

    public void notifyOnLocationCreation(Location loc, boolean tbl) {
        System.out.println("Локация " + loc.toString() + " Создана");
        if (tbl)
            this.notifyLocationConditions(loc);
    }

    public void notifyCharacterConditions(Character ch) {
        System.out.println("У " + ch.toString() + " " + ch.getConditionDescriptions());
    }

    public void notifyOnCharacterCreation(Character ch, boolean tbl) {
        System.out.println("Персонаж(и) " + ch.toString() + " добавлены");
        if (tbl)
            this.notifyCharacterConditions(ch);
    }

    @Override
    public void reportCustom(String msg) {
        System.out.println(msg);
    }

}
