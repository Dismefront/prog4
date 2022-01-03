package characters;

import ambient.Location;
import states.Health;

import java.util.ArrayList;

public abstract class Character implements HealthAppliable {

    protected String name;
    ArrayList<Health> currentStates;

    {
        currentStates = new ArrayList<Health>();
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void applyConditions(Health ... args) {
        this.currentStates.clear();
        for (Health x : args)
            this.currentStates.add(x);
    }

    public String getConditionDescriptions() {
        String result = "";
        for (Health x : this.currentStates) {
            result += x + " ";
        }
        return result;
    }

    public abstract void pump();
    public abstract void chill(Location loc);
    public abstract void pullTrigger();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
