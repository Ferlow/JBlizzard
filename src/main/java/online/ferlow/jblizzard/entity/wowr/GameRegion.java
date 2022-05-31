package online.ferlow.jblizzard.entity.wowr;

import online.ferlow.jblizzard.entity.constants.Regionality;
import online.ferlow.jblizzard.entity.constants.WowDataRequestEntity;
import online.ferlow.jblizzard.entity.wowr.data.achievement.Achievement;
import online.ferlow.jblizzard.entity.wowr.data.achievement.AchievementCategory;
import online.ferlow.jblizzard.entity.wowr.data.achievement.AchievementIndex;
import online.ferlow.jblizzard.entity.wowr.data.achievement.AchievementMedia;
import online.ferlow.jblizzard.entity.wowr.data.auction.Auction;
import online.ferlow.jblizzard.entity.wowr.data.auction.AuctionIndex;
import online.ferlow.jblizzard.entity.wowr.data.azerite.AzeriteEssence;
import online.ferlow.jblizzard.entity.wowr.data.azerite.AzeriteEssenceIndex;
import online.ferlow.jblizzard.entity.wowr.data.azerite.AzeriteEssenceMedia;
import online.ferlow.jblizzard.entity.wowr.data.realm.Realm;
import online.ferlow.jblizzard.entity.wowr.data.realm.RealmIndex;
import online.ferlow.jblizzard.entity.wowr.data.token.WowToken;
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

    public AchievementMedia getAchievementMediaById(String id) {
        String json = RequestHandler.getJsonFromParam(regionality,WowDataRequestEntity.ACHIEVEMENT_MEDIA,id);
        return RequestHandler.getGSON().fromJson(json,WowDataRequestEntity.ACHIEVEMENT_MEDIA.getResponseClass());
    }

    public List<Achievement> getAchievements() {
        String json = RequestHandler.getJson(regionality, WowDataRequestEntity.ACHIEVEMENT_INDEX);
        AchievementIndex achievements = RequestHandler.getGSON().fromJson(json, WowDataRequestEntity.ACHIEVEMENT_INDEX.getResponseClass());
        return achievements.getAchievements();
    }

    public List<Auction> getAuctions(String connectedRealm) {
        String json = RequestHandler.getJsonFromParam(regionality,WowDataRequestEntity.AUCTION,connectedRealm + "/auctions");
        AuctionIndex auctions = RequestHandler.getGSON().fromJson(json,WowDataRequestEntity.AUCTION.getResponseClass());
        return auctions.getAuctions();
    }

    public List<AzeriteEssence> getAzeriteEssence() {
        String json = RequestHandler.getJson(regionality,WowDataRequestEntity.AZERITE_ESSENCE_INDEX);
        AzeriteEssenceIndex azeriteEssenceIndex = RequestHandler.getGSON().fromJson(json,WowDataRequestEntity.AZERITE_ESSENCE_INDEX.getResponseClass());
        return azeriteEssenceIndex.getAzeriteEssencesList();
    }

    public AzeriteEssence getAzeriteEssenceById ( String essenceId ) {
        String json = RequestHandler.getJsonFromParam(regionality, WowDataRequestEntity.AZERITE_ESSENCE,essenceId);
        return RequestHandler.getGSON().fromJson(json,WowDataRequestEntity.AZERITE_ESSENCE.getResponseClass());
    }

    public AzeriteEssenceMedia getAzeriteEssenceMediaById ( String essenceId ) {
        String json = RequestHandler.getJsonFromParam(regionality, WowDataRequestEntity.AZERITE_ESSENCE_MEDIA,essenceId);
        return RequestHandler.getGSON().fromJson(json,WowDataRequestEntity.AZERITE_ESSENCE_MEDIA.getResponseClass());

    }
}
