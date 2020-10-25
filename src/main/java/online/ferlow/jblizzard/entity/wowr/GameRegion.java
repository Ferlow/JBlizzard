package online.ferlow.jblizzard.entity.wowr;

import online.ferlow.jblizzard.entity.constants.Regionality;
import online.ferlow.jblizzard.entity.constants.WowRequestEntity;
import online.ferlow.jblizzard.entity.wowr.data.Realm;
import online.ferlow.jblizzard.entity.wowr.data.RealmIndex;
import online.ferlow.jblizzard.entity.wowr.data.WowToken;
import online.ferlow.jblizzard.request.RequestHandler;

import java.util.List;

public class GameRegion {
    private final String name;
    private final String identifier;
    private final Regionality regionality;

    public GameRegion(String name, String identifier, Regionality regionality) {
        this.name = name;
        this.identifier = identifier;
        this.regionality = regionality;
    }

    public WowToken getWowToken() {
        String json = RequestHandler.getJson(regionality, WowRequestEntity.WOW_TOKEN);
        return RequestHandler.getGSON().fromJson(json, WowRequestEntity.WOW_TOKEN.getResponseClass());
    }

    public List<Realm> getRealms() {
        String json = RequestHandler.getJson(regionality, WowRequestEntity.REALM_INDEX);
        RealmIndex realms = RequestHandler.getGSON().fromJson(json, WowRequestEntity.REALM_INDEX.getResponseClass());
        return realms.getRealms();
    }

    public Realm getRealmByName(String name) {
        String json = RequestHandler.getJsonFromParam(regionality, WowRequestEntity.REALM, name);
        return RequestHandler.getGSON().fromJson(json, WowRequestEntity.REALM.getResponseClass());
    }
}
