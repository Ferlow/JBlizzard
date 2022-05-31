package online.ferlow.jblizzard.entity.wowr.data.covenant;

import com.google.gson.annotations.SerializedName;
import online.ferlow.jblizzard.entity.wowr.data.spell.Spell;
import online.ferlow.jblizzard.entity.wowr.data.spell.SpellTooltip;

public class Covenant {

    private String name,description;
    private int id;
    @SerializedName("signature_ability")
    private SignatureAbility signatureAbility;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SignatureAbility getSignatureAbility() {
        return signatureAbility;
    }

    public void setSignatureAbility(SignatureAbility signatureAbility) {
        this.signatureAbility = signatureAbility;
    }

    @Override
    public String toString() {
        return "Covenant{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", signatureAbility=" + signatureAbility +
                '}';
    }
}
