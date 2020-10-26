package online.ferlow.jblizzard.request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kong.unirest.Unirest;
import online.ferlow.jblizzard.entity.constants.Locale;
import online.ferlow.jblizzard.entity.constants.Regionality;
import online.ferlow.jblizzard.entity.constants.WowDataRequestEntity;
import online.ferlow.jblizzard.oauth.AccessToken;


public class RequestHandler {
    private static final String BASE_URL = ".api.blizzard.com/";
    private static final Gson GSON = new GsonBuilder().create();
    private static Locale locale;
    private static AccessToken accessToken;

    public static void setAccessToken(AccessToken accessToken) {
        RequestHandler.accessToken = accessToken;
    }

    public static void setLocale(Locale locale) {
        RequestHandler.locale = locale;
    }

    public static String getJson(Regionality region, WowDataRequestEntity wowDataRequestEntity) {
        String requestUrl = "https://".concat(region.getIdentifier())
                .concat(BASE_URL)
                .concat(wowDataRequestEntity.getEndpoint())
                .concat("?namespace=")
                .concat(wowDataRequestEntity.getRequiredNamespace().getIdentifier())
                .concat(region.getIdentifier())
                .concat("&locale=")
                .concat(locale.getCode());
        System.out.println(requestUrl);
        return Unirest.get(requestUrl)
                .header("Authorization", "Bearer " + accessToken.getAsString())
                .asString().getBody();
    }

    public static String getJsonFromParam(Regionality region, WowDataRequestEntity wowDataRequestEntity, String paramString) {
        String requestUrl = "https://".concat(region.getIdentifier())
                .concat(BASE_URL)
                .concat(wowDataRequestEntity.getEndpoint())
                .concat(paramString)
                .concat("?namespace=")
                .concat(wowDataRequestEntity.getRequiredNamespace().getIdentifier())
                .concat(region.getIdentifier())
                .concat("&locale=")
                .concat(locale.getCode());
        System.out.println(requestUrl);
        return Unirest.get(requestUrl)
                .header("Authorization", "Bearer " + accessToken.getAsString())
                .asString().getBody();
    }

    public static Gson getGSON() {
        return GSON;
    }
}
