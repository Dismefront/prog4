package states;

public enum Health {

    SWEATY("Пот льется рекой"), COUGH("Кашель"),
    SNEEZE("Чих"), RHEUMATOID("Ревматит"),
    CATHAR("Катар"), FLU("Грипп"),
    PNEUMONIA("Воспаление легких"),
    TIREDNESS("Усталость после работы");

    private String name;

    Health(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
