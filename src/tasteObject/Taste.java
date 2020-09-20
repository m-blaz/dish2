package tasteObject;

public enum Taste {
    BITTER("горький"),
    SALTY ("солёный"),
    SWEET("сладкий"),
    SOUR("кислый");

    private String s;

    Taste(String s) {
        this.s = s;
    }
}
