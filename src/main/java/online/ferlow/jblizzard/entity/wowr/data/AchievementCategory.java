package online.ferlow.jblizzard.entity.wowr.data;

import java.util.List;

public class AchievementCategory {
    private String id, name;
    private List<Achievement> achievements;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }
}
