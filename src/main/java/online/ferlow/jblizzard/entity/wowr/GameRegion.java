package online.ferlow.jblizzard.entity.wowr;

import online.ferlow.jblizzard.entity.constants.Regionality;
import online.ferlow.jblizzard.entity.constants.WowDataRequestEntity;
import online.ferlow.jblizzard.entity.wowr.data.*;
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
        String json = RequestHandler.getJson(regionality, WowDataRequestEntity.WOW_TOKEN);
        return RequestHandler.getGSON().fromJson(json, WowDataRequestEntity.WOW_TOKEN.getResponseClass());
    }

    public List<Realm> getRealms() {
        String json = RequestHandler.getJson(regionality, WowDataRequestEntity.REALM_INDEX);
        RealmIndex realms = RequestHandler.getGSON().fromJson(json, WowDataRequestEntity.REALM_INDEX.getResponseClass());
        return realms.getRealms();
    }

    public Realm getRealmByName(String name) {
        String json = RequestHandler.getJsonFromParam(regionality, WowDataRequestEntity.REALM, name);
        return RequestHandler.getGSON().fromJson(json, WowDataRequestEntity.REALM.getResponseClass());
    }

    public Achievement getAchievementById(String id) {
        String json = RequestHandler.getJsonFromParam(regionality, WowDataRequestEntity.ACHIEVEMENT, id);
        return RequestHandler.getGSON().fromJson(json, WowDataRequestEntity.ACHIEVEMENT.getResponseClass());
    }

    public AchievementCategory getAchievementCategoryById(String id) {
        String json = RequestHandler.getJsonFromParam(regionality, WowDataRequestEntity.ACHIEVEMENT_CATEGORY, id);
        return RequestHandler.getGSON().fromJson(json, WowDataRequestEntity.ACHIEVEMENT_CATEGORY.getResponseClass());
    }

    public List<Achievement> getAchievements() {
        String json = RequestHandler.getJson(regionality, WowDataRequestEntity.ACHIEVEMENT_INDEX);
        AchievementIndex achievements = RequestHandler.getGSON().fromJson(json, WowDataRequestEntity.ACHIEVEMENT_INDEX.getResponseClass());
        return achievements.getAchievements();
    }
}
