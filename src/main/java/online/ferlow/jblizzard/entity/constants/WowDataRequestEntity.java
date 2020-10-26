package online.ferlow.jblizzard.entity.constants;

import online.ferlow.jblizzard.entity.wowr.data.*;

import java.lang.reflect.Type;

public enum WowDataRequestEntity {
    ACHIEVEMENT("achievement/", Namespace.STATIC, Achievement.class),
    ACHIEVEMENT_CATEGORY("achievement-category/", Namespace.STATIC, AchievementCategory.class),
    ACHIEVEMENT_INDEX("achievement/index", Namespace.STATIC, AchievementIndex.class),
    REALM("realm/", Namespace.DYNAMIC, Realm.class),
    REALM_INDEX("realm/index", Namespace.DYNAMIC, RealmIndex.class),
    WOW_TOKEN("token/", Namespace.DYNAMIC, WowToken.class);

    private final String endpoint;
    private final Namespace requiredNamespace;
    private final Type responseClass;

    WowDataRequestEntity(String endpoint, Namespace requiredNamespace, Type responseClass) {
        this.endpoint = "/data/wow/".concat(endpoint);
        this.requiredNamespace = requiredNamespace;
        this.responseClass = responseClass;
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
