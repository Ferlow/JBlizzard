package online.ferlow.jblizzard.entity.wowr.data.covenant;

import com.google.gson.annotations.SerializedName;
import online.ferlow.jblizzard.entity.wowr.data.spell.SpellTooltip;

public class SignatureAbility {

    private int id;
    @SerializedName("spell_tooltip")
    private SpellTooltip spellTooltip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SpellTooltip getSpellTooltip() {
        return spellTooltip;
    }

    public void setSpellTooltip(SpellTooltip spellTooltip) {
        this.spellTooltip = spellTooltip;
    }

    @Override
    public String toString() {
        return "SignatureAbility{" +
                "id=" + id +
                ", spellTooltip=" + spellTooltip +
                '}';
    }
}
