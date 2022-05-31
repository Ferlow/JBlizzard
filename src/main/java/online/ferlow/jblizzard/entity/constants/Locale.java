package online.ferlow.jblizzard.entity.constants;

public enum Locale {
    EN_GB("en_GB"),
    EN_US("en_US"),
    IT_IT("it_IT");

    private final String code;

    Locale(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
