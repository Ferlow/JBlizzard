package online.ferlow.jblizzard.entity.wowr.data;

import com.google.gson.annotations.SerializedName;

public class Achievement {
    private String id, name, description;
    private int points;
    @SerializedName("is_account_wide")
    private boolean isAccountWide;
    private AchievementCategory category;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public AchievementCategory getCategory() {
        return category;
    }

    public int getPoints() {
        return points;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAccountWide() {
        return isAccountWide;
    }
}

