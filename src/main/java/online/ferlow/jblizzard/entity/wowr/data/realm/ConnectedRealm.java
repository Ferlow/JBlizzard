package online.ferlow.jblizzard.entity.wowr.data.realm;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConnectedRealm {

    private String href;
    private int id;
    @SerializedName("has_queue")
    private boolean hasQueque;
    private RealmStatus status;
    private RealmPopulation population;
    private List<Realm> realms;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHasQueque() {
        return hasQueque;
    }

    public void setHasQueque(boolean hasQueque) {
        this.hasQueque = hasQueque;
    }

    public RealmStatus getStatus() {
        return status;
    }

    public void setStatus(RealmStatus status) {
        this.status = status;
    }

    public RealmPopulation getPopulation() {
        return population;
    }

    public void setPopulation(RealmPopulation population) {
        this.population = population;
    }

    public List<Realm> getRealms() {
        return realms;
    }

    public void setRealms(List<Realm> realms) {
        this.realms = realms;
    }

    @Override
    public String toString() {
        return "ConnectedRealm{" +
                "href='" + href + '\'' +
                ", id=" + id +
                ", hasQueque=" + hasQueque +
                ", status=" + status +
                ", population=" + population +
                ", realms=" + realms +
                '}';
    }
}
