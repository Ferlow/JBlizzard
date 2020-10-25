package online.ferlow.jblizzard.entity.constants;

public enum Regionality {
    EU("eu", "Europe"),
    KR("kr", "Korea"),
    US("us", "America"),
    TW("tw", "Taiwan");

    private final String identifier, name;

    Regionality(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
}
