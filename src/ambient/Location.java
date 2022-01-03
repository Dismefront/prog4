package ambient;

import abstractions.MessageProcesser;
import changes.DevilWheel;
import states.Atmosphere;

import java.util.ArrayList;

public abstract class Location implements AtmosphereAppliable {

    ArrayList<Atmosphere> currentStates;
    protected String name;

    {
        currentStates = new ArrayList<Atmosphere>();
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
    public void applyConditions(Atmosphere... args) {
        for (Atmosphere x : args)
            this.currentStates.add(x);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getConditionDescriptions() {
        String result = "";
        for (Atmosphere x : this.currentStates)
            result += x.toString() + " ";
        if (result.equals(""))
            result = "никаких условий";
        return result;
    }

}
