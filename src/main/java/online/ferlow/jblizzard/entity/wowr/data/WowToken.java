package online.ferlow.jblizzard.entity.wowr.data;

import com.google.gson.annotations.SerializedName;

public class WowToken {
    @SerializedName("last_updated_timestamp")
    private long lastUpdatedAt;
    private long price;

    public long getPriceInGold() {
        return price / 10000;
    }

    public long getLastUpdatedTimestamp() {
        return lastUpdatedAt;
    }
}
