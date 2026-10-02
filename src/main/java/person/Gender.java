package person;

public enum Gender {
    MÄNNLICH("Männlich"),
    WEIBLICH("Weiblich"),
    DIVERS("Divers");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}