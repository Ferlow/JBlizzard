package online.ferlow.jblizzard;

import online.ferlow.jblizzard.entity.constants.Locale;
import online.ferlow.jblizzard.entity.constants.Regionality;
import online.ferlow.jblizzard.entity.wowr.GameRegion;
import online.ferlow.jblizzard.oauth.OAuthHandler;
import online.ferlow.jblizzard.request.RequestHandler;

public class JBlizzardClient {

    public JBlizzardClient(String clientId, String clientSecret, Locale locale) {
        RequestHandler.setAccessToken(OAuthHandler.generateAccessToken(clientId, clientSecret));
        RequestHandler.setLocale(locale);
    }

    private GameRegion getRegion(Regionality regionality) {
        return new GameRegion(regionality.getName(), regionality.getIdentifier(), regionality);
    }

    public GameRegion getEuRegion() {
        return getRegion(Regionality.EU);
    }

    public GameRegion getKrRegion() {
        return getRegion(Regionality.KR);
    }

    public GameRegion getTwRegion() {
        return getRegion(Regionality.TW);
    }

    public GameRegion getUsRegion() {
        return getRegion(Regionality.US);
    }
}
