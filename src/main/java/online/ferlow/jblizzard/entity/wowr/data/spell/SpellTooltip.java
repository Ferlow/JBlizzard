package online.ferlow.jblizzard.entity.wowr.data.spell;

import com.google.gson.annotations.SerializedName;

public class SpellTooltip {

    private String description;
    @SerializedName("cast_time")
    private String castTime;
    private String range;
    private String cooldown;
    private Spell spell;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCastTime() {
        return castTime;
    }

    public void setCastTime(String castTime) {
        this.castTime = castTime;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getCooldown() {
        return cooldown;
    }

    public void setCooldown(String cooldown) {
        this.cooldown = cooldown;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "SpellTooltip{" +
                "description='" + description + '\'' +
                ", castTime='" + castTime + '\'' +
                ", range='" + range + '\'' +
                ", cooldown='" + cooldown + '\'' +
                ", spell=" + spell +
                '}';
    }
}
