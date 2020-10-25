package online.ferlow.jblizzard.entity.constants;

import online.ferlow.jblizzard.entity.wowr.data.Achievement;
import online.ferlow.jblizzard.entity.wowr.data.Realm;
import online.ferlow.jblizzard.entity.wowr.data.RealmIndex;
import online.ferlow.jblizzard.entity.wowr.data.WowToken;

import java.lang.reflect.Type;

public enum WowRequestEntity {
    ACHIEVEMENT("/data/wow/achievement/", Namespace.STATIC, Achievement.class),
    REALM("data/wow/realm/", Namespace.DYNAMIC, Realm.class),
    REALM_INDEX("data/wow/realm/index", Namespace.DYNAMIC, RealmIndex.class),
    WOW_TOKEN("data/wow/token/", Namespace.DYNAMIC, WowToken.class);

    private final String endpoint;
    private final Namespace requiredNamespace;
    private final Type responseClass;

    WowRequestEntity(String endpoint, Namespace requiredNamespace, Type responseClass) {
        this.endpoint = endpoint;
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
