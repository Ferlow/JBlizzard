package online.ferlow.jblizzard.entity.wowr.data.covenant;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CovenantIndex {

    private List<Covenant> covenants;

    public List<Covenant> getCovenantList() {
        return covenants;
    }

    public void setCovenantList(List<Covenant> covenants) {
        this.covenants = covenants;
    }

    @Override
    public String toString() {
        return "CovenantIndex{" +
                "covenants=" + covenants +
                '}';
    }
}
