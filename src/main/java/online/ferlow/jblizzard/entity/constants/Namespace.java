package online.ferlow.jblizzard.entity.constants;

public enum Namespace {
    STATIC("static-"),
    DYNAMIC("dynamic-"),
    PROFILE("profile-");

    private final String identifier;

    Namespace(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
