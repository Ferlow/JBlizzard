package online.ferlow.jblizzard.entity.wowr.data.azerite;

public class AzeriteEssence {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AzeriteEssence{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
