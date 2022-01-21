package main;

import abstractions.MessageProcesser;
import changes.*;
import ambient.EventManager;
import changes.GroupOfTwisters;
import characters.Ponchik;
import states.Atmosphere;
import states.Health;

//lab4

public class Main {

    public static void main(String ... args) {
        int[] qq = { 1, 2, 3, 4, 5, 6 };

        DevilWheel dv = new DevilWheel();

        Tub tub = new Tub();
        tub.applyConditions(Atmosphere.DARK, Atmosphere.MUGGY,
                Atmosphere.RAW, Atmosphere.TIGHT);
        MessageProcesser.begin().notifyOnLocationCreation(tub, true);

        ConstructedLocation locWhole = new ConstructedLocation();
        try {
            locWhole.makeLocationWhole(tub, dv);
        }
        catch (IncorrectLocationException e) {
            MessageProcesser.begin().reportCustom("Не удалось построить локацию...");
            return;
        }
        Tub.ToolMerger.addTool(new Tub.Tool("Якорь") {

            @Override
            public void use() {
                throwed();
            }

            private void throwed() {
                MessageProcesser.begin(0).reportCustom(this + " выброшен");
            }

        }, tub);

        Ship ship = locWhole.getShip();
        ship.swim();

        GroupOfTwisters got = new GroupOfTwisters();
        got.applyConditions(Health.SWEATY);
        MessageProcesser.begin().notifyOnCharacterCreation(got, true);

        AuthorWords.sayHardJob();

        got.undress();
        EventManager.createFlood(tub);
        EventManager.fightEventWithCharacter(got);
        got.applyConditions(Health.COUGH, Health.SNEEZE, Health.RHEUMATOID,
                Health.CATHAR, Health.FLU, Health.PNEUMONIA);
        MessageProcesser.begin().notifyCharacterConditions(got);
        Ponchik ponchik = new Ponchik();
        ponchik.applyConditions(Health.TIREDNESS);
        MessageProcesser.begin().notifyOnCharacterCreation(ponchik, true);
        ponchik.lay();
        ponchik.eat();
        EventManager.createPleasuringEvent(ponchik, (x) -> x.chill(dv));

    }

}
