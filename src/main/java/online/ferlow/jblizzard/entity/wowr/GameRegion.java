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
import online.ferlow.jblizzard.entity.wowr.data.covenant.Covenant;
import online.ferlow.jblizzard.entity.wowr.data.covenant.CovenantIndex;
import online.ferlow.jblizzard.entity.wowr.data.realm.ConnectedRealm;
import online.ferlow.jblizzard.entity.wowr.data.realm.ConnectedRealmIndex;
import online.ferlow.jblizzard.entity.wowr.data.realm.Realm;
import online.ferlow.jblizzard.entity.wowr.data.realm.RealmIndex;
import online.ferlow.jblizzard.entity.wowr.data.token.WowToken;
import online.ferlow.jblizzard.request.RequestHandler;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    // Need to have the regex for extract the realm id
    public List<ConnectedRealm> getConnectedRealms() {
        String json = RequestHandler.getJson(regionality,WowDataRequestEntity.CONNECTED_REALM_INDEX);
        ConnectedRealmIndex connectedRealms = RequestHandler.getGSON().fromJson(json,WowDataRequestEntity.CONNECTED_REALM_INDEX.getResponseClass());
        connectedRealms.getConnectedRealms().forEach(connectedRealm -> {
            String href = connectedRealm.getHref();
            Pattern pattern = Pattern.compile("[0-9]{1,3}", Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(href);
            while ( matcher.find() ) {
                connectedRealm.setId(Integer.parseInt(matcher.group()));
            }
        });
        return connectedRealms.getConnectedRealms();
    }

    public ConnectedRealm getConnectedRealm( String realmId) {
        String json = RequestHandler.getJsonFromParam(regionality,WowDataRequestEntity.CONNECTED_REALM,realmId);
        return RequestHandler.getGSON().fromJson(json,WowDataRequestEntity.CONNECTED_REALM.getResponseClass());
    }

    public Achievement getAchievementById(String achievementId) {
        String json = RequestHandler.getJsonFromParam(regionality, WowDataRequestEntity.ACHIEVEMENT, achievementId);
        return RequestHandler.getGSON().fromJson(json, WowDataRequestEntity.ACHIEVEMENT.getResponseClass());
    }

    public AchievementCategory getAchievementCategoryById(String achievementId) {
        String json = RequestHandler.getJsonFromParam(regionality, WowDataRequestEntity.ACHIEVEMENT_CATEGORY, achievementId);
        return RequestHandler.getGSON().fromJson(json, WowDataRequestEntity.ACHIEVEMENT_CATEGORY.getResponseClass());
    }

    public AchievementMedia getAchievementMediaById(String achievementId) {
        String json = RequestHandler.getJsonFromParam(regionality,WowDataRequestEntity.ACHIEVEMENT_MEDIA,achievementId);
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

    public List<AzeriteEssence> getAzeriteEssences() {
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

    public List<Covenant> getCovenants() {
        String json = RequestHandler.getJson(regionality,WowDataRequestEntity.COVENANT_INDEX);
        CovenantIndex covenantList = RequestHandler.getGSON().fromJson(json,WowDataRequestEntity.COVENANT_INDEX.getResponseClass());
        return covenantList.getCovenantList();
    }

    public Covenant getCovenantById( String covenantId ) {
        String json = RequestHandler.getJsonFromParam(regionality,WowDataRequestEntity.COVENANT,covenantId);
        return RequestHandler.getGSON().fromJson(json,WowDataRequestEntity.COVENANT.getResponseClass());
    }
}
