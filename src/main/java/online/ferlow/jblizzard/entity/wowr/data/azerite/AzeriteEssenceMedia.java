package online.ferlow.jblizzard.entity.wowr.data.azerite;

import online.ferlow.jblizzard.entity.wowr.data.Asset;

import java.util.List;

public class AzeriteEssenceMedia {

    private int id;
    private List<Asset> assets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    @Override
    public String toString() {
        return "AzeriteEssenceMedia{" +
                "id=" + id +
                ", assets=" + assets +
                '}';
    }
}
