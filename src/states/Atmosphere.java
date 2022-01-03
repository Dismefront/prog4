package states;

public enum Atmosphere {

    DARK("Темно"), TIGHT("Тесно"),
    RAW("Сыро"), MUGGY("Душно");

    private String name;

    Atmosphere(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
