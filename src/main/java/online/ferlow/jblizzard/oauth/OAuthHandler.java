package online.ferlow.jblizzard.oauth;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kong.unirest.Unirest;

import java.util.Base64;

public class OAuthHandler {
    private static final String URL = "https://us.battle.net/oauth/token";
    private static final Gson GSON = new GsonBuilder().create();

    public static AccessToken generateAccessToken(String clientId, String clientSecret) {
        String basicToken = Base64.getEncoder().encodeToString((clientId.concat(":").concat(clientSecret).getBytes()));
        String json = Unirest.post("https://us.battle.net/oauth/token")
                .header("Authorization", "Basic " + basicToken)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .field("grant_type", "client_credentials").asString().getBody();
        return GSON.fromJson(json, AccessToken.class);
    }
}
