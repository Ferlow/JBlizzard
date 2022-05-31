package online.ferlow.jblizzard.entity.wowr.data.realm;

import com.google.gson.annotations.SerializedName;

public class Realm {
    private String id, slug, name, category, locale, timezone;
    @SerializedName("is_tournament")
    private boolean isTournament;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public boolean isTournament() {
        return isTournament;
    }

    public void setTournament(boolean tournament) {
        isTournament = tournament;
    }

    @Override
    public String toString() {
        return "Realm{" +
                "id='" + id + '\'' +
                ", slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", locale='" + locale + '\'' +
                ", timezone='" + timezone + '\'' +
                ", isTournament=" + isTournament +
                '}';
    }
}
