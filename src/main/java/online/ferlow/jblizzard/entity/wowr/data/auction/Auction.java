package online.ferlow.jblizzard.entity.wowr.data.auction;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Auction {

    private int id, quantity;
    private BigDecimal buyout;
    @SerializedName("time_left")
    private String timeLeft;
    private Item item;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getBuyout() {
        return buyout;
    }

    public void setBuyout(BigDecimal buyout) {
        this.buyout = buyout;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", buyout=" + buyout +
                ", timeLeft='" + timeLeft + '\'' +
                ", item=" + item +
                '}';
    }
}

