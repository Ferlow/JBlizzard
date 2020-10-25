import online.ferlow.jblizzard.JBlizzardClient;
import online.ferlow.jblizzard.entity.constants.Locale;

public class Run {
    public static void main(String[] args) {
        JBlizzardClient jbcl = new JBlizzardClient(args[0], args[1], Locale.EN_GB);
        System.out.println(jbcl.getEuRegion().getRealms().get(0).getSlug());
        System.out.println(jbcl.getEuRegion().getRealmByName("aggramar").getName());
    }
}
