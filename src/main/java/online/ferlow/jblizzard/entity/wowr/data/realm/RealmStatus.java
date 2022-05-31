package online.ferlow.jblizzard.entity.wowr.data.realm;

public class RealmStatus {

    private String type,name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RealmStatus{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
