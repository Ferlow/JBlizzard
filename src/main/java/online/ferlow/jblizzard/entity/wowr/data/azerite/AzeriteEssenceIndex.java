package online.ferlow.jblizzard.entity.wowr.data.azerite;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AzeriteEssenceIndex {

    @SerializedName("azerite_essences")
    private List<AzeriteEssence> azeriteEssencesList;

    public List<AzeriteEssence> getAzeriteEssencesList() {
        return azeriteEssencesList;
    }

    public void setAzeriteEssencesList(List<AzeriteEssence> azeriteEssencesList) {
        this.azeriteEssencesList = azeriteEssencesList;
    }

    @Override
    public String toString() {
        return "AzeriteEssenceIndex{" +
                "azeriteEssencesList=" + azeriteEssencesList +
                '}';
    }
}
