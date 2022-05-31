package online.ferlow.jblizzard.entity.wowr.data.achievement;

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

    @Override
    public String toString() {
        return "AchievementCategory{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", achievements=" + achievements +
                '}';
    }
}
