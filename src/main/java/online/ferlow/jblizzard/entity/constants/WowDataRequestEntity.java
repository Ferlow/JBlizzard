package online.ferlow.jblizzard.entity.constants;

import online.ferlow.jblizzard.entity.wowr.data.achievement.Achievement;
import online.ferlow.jblizzard.entity.wowr.data.achievement.AchievementCategory;
import online.ferlow.jblizzard.entity.wowr.data.achievement.AchievementIndex;
import online.ferlow.jblizzard.entity.wowr.data.achievement.AchievementMedia;
import online.ferlow.jblizzard.entity.wowr.data.auction.AuctionIndex;
import online.ferlow.jblizzard.entity.wowr.data.azerite.AzeriteEssence;
import online.ferlow.jblizzard.entity.wowr.data.azerite.AzeriteEssenceIndex;
import online.ferlow.jblizzard.entity.wowr.data.azerite.AzeriteEssenceMedia;
import online.ferlow.jblizzard.entity.wowr.data.realm.Realm;
import online.ferlow.jblizzard.entity.wowr.data.realm.RealmIndex;
import online.ferlow.jblizzard.entity.wowr.data.token.WowToken;

import java.lang.reflect.Type;

public enum WowDataRequestEntity {
    ACHIEVEMENT("achievement/", Namespace.STATIC, Achievement.class),
    ACHIEVEMENT_CATEGORY("achievement-category/", Namespace.STATIC, AchievementCategory.class),
    ACHIEVEMENT_INDEX("achievement/index", Namespace.STATIC, AchievementIndex.class),
    ACHIEVEMENT_MEDIA("achievement/",Namespace.STATIC, AchievementMedia.class,true),
    REALM("realm/", Namespace.DYNAMIC, Realm.class),
    REALM_INDEX("realm/index", Namespace.DYNAMIC, RealmIndex.class),
    AUCTION("connected-realm/",Namespace.DYNAMIC, AuctionIndex.class),
    AZERITE_ESSENCE_INDEX("azerite-essence/",Namespace.STATIC, AzeriteEssenceIndex.class),
    AZERITE_ESSENCE("azerite-essence/",Namespace.STATIC,AzeriteEssence.class),
    AZERITE_ESSENCE_MEDIA("azerite-essence/",Namespace.STATIC, AzeriteEssenceMedia.class,true),
    WOW_TOKEN("token/", Namespace.DYNAMIC, WowToken.class);

    private final String endpoint;
    private final Namespace requiredNamespace;
    private final Type responseClass;
    private final boolean isMedia;

    WowDataRequestEntity(String endpoint, Namespace requiredNamespace, Type responseClass) {
        this.endpoint = "/data/wow/".concat(endpoint);
        this.requiredNamespace = requiredNamespace;
        this.responseClass = responseClass;
        this.isMedia = false;
    }

    WowDataRequestEntity(String endpoint, Namespace requiredNamespace, Type responseClass, boolean isMedia) {
        this.endpoint = "/data/wow/media/".concat(endpoint);
        this.requiredNamespace = requiredNamespace;
        this.responseClass = responseClass;
        this.isMedia = isMedia;
    }

    public Namespace getRequiredNamespace() {
        return requiredNamespace;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public Type getResponseClass() {
        return responseClass;
    }
}
