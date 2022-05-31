package online.ferlow.jblizzard.entity.wowr.data.realm;

public class Realm {
    private String id, slug, name;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    @Override
    public String toString() {
        return "Realm{" +
                "id='" + id + '\'' +
                ", slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
