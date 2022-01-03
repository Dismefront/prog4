package changes;

import abstractions.MessageProcesser;
import ambient.Location;
import states.Atmosphere;

public class Tub extends Location {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Tub() {
        this.name = "Лоханка";
    }

    public static abstract class Tool {

        protected String name;

        public Tool(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }

        public abstract void use();

    }

    public static class ToolMerger {

        public static void addTool(Tool t, Tub loc) {
            MessageProcesser.begin().reportCustom(t + " добавлен к " + loc);
            t.use();
        }

    }

}
