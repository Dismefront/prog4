package changes;

import abstractions.MessageProcesser;
import ambient.Location;

import java.util.ArrayList;

public class DevilWheel extends Location {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private Disc disc;
    private VerticalAxisDetail axis;

    public DevilWheel() {
        this.name = "Чертово Колесо";
        this.disc = new Disc();
        this.axis = new VerticalAxisDetail();

        class DevilWheelConstructor {

            static void merge(DevilWheel d, Detail ... dets) {
                ArrayList<String> arr = new ArrayList<String>();
                for (Detail x : dets) {
                    x.getBuilt();
                    arr.add(x.toString());
                }
                String msg = String.join(", ", arr) + " собраны воедино";
                MessageProcesser.begin(0).reportCustom(msg);
                MessageProcesser.begin().notifyOnLocationCreation(d, true);
            }

        }

        DevilWheelConstructor.merge(this, this.disc, this.axis);

    }

    public static abstract class Detail {

        protected String name;

        public Detail() {
            this.name = "Деталь";
        }

        public Detail(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }

        public abstract void getBuilt();

    }

    class Disc extends Detail {

        {
            this.name = "Диск";
        }

        private void rotate() {
            MessageProcesser.begin(0).reportCustom(this + " крутится");
        }

        @Override
        public void getBuilt() {
            rotate();
        }

    }

    class VerticalAxisDetail extends Detail {

        {
            this.name = "Вертикальныая ось";
        }

        private void stands() {
            MessageProcesser.begin(0).reportCustom(this + " стоит крепко");
        }

        @Override
        public void getBuilt() {
            stands();
        }

    }

}
