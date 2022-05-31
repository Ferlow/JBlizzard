package online.ferlow.jblizzard.entity.wowr.data.realm;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConnectedRealmIndex {

    @SerializedName("connected_realms")
    private List<ConnectedRealm> connectedRealms;

    public List<ConnectedRealm> getConnectedRealms() {
        return connectedRealms;
    }

    public void setConnectedRealms(List<ConnectedRealm> connectedRealms) {
        this.connectedRealms = connectedRealms;
    }

    @Override
    public String toString() {
        return "ConnectedRealmIndex{" +
                "connectedRealms=" + connectedRealms +
                '}';
    }
}
