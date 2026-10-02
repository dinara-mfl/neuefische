package person;

public enum DaysOfWeek {
    MONTAG("Montag"),
    DIENSTAG("Dienstag"),
    MITTWOCH("Mittwoch"),
    DONERSTAG("Donerstag"),
    FREITAG("Freitag"),
    SAMSTAG("Wochenende"),
    SONNTAG("Wochenende");

    private final String value;

    DaysOfWeek(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}