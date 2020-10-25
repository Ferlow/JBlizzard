package online.ferlow.jblizzard.oauth;

public class AccessToken {
    private String access_token;
    private long expires_in;

    public String getAsString() {
        return access_token;
    }
}
