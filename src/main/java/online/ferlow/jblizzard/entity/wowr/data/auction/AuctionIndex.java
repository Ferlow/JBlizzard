package online.ferlow.jblizzard.entity.wowr.data.auction;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AuctionIndex {

    @SerializedName("auctions")
    private List<Auction> auctions;

    public List<Auction> getAuctions() {
        return auctions;
    }

    public void setAuctions(List<Auction> auctions) {
        this.auctions = auctions;
    }
}
