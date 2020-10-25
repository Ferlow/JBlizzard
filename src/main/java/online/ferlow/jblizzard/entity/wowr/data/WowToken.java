package online.ferlow.jblizzard.entity.wowr.data;

public class WowToken {
    private long last_updated_timestamp, price;

    public long getPriceInGold() {
        return price / 10000;
    }

    public long getLast_updated_timestamp() {
        return last_updated_timestamp;
    }
}
