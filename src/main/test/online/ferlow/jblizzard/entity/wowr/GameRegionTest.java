package online.ferlow.jblizzard.entity.wowr;

import online.ferlow.jblizzard.JBlizzardClient;
import online.ferlow.jblizzard.entity.constants.Locale;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GameRegionTest {


    JBlizzardClient jbcl;


    @BeforeAll
    void setUp() {
        jbcl = new JBlizzardClient("TOKEN_ID", "TOKEN_SECRET", Locale.IT_IT);

    }

    @Order(1)
    @Test
    void getWowToken() {
        assertNotNull(jbcl.getEuRegion().getWowToken());
        System.out.println(jbcl.getEuRegion().getWowToken());
    }

    @Order(2)
    @Test
    void getRealms() {
        assertNotNull(jbcl.getEuRegion().getRealms());
        assertTrue(jbcl.getEuRegion().getRealms().size() > 0);
        System.out.println(jbcl.getEuRegion().getRealms());
    }

    @Order(3)
    @Test
    void getRealmByName() {
        assertNotNull(jbcl.getEuRegion().getRealmByName("aggramar"));
        System.out.println(jbcl.getEuRegion().getRealmByName("aggramar"));
    }

    @Order(4)
    @Test
    void getAchievementById() {
        assertNotNull(jbcl.getEuRegion().getAchievementById("15092"));
        System.out.println(jbcl.getEuRegion().getAchievementById("15092"));
    }

    @Order(5)
    @Test
    void getAchievementCategoryById() {
        assertNotNull(jbcl.getEuRegion().getAchievementCategoryById("15092"));
        System.out.println(jbcl.getEuRegion().getAchievementCategoryById("15092"));
    }

    @Order(6)
    @Test
    void getAchievementMediaById() {
        assertNotNull(jbcl.getEuRegion().getAchievementMediaById("15092"));
        System.out.println(jbcl.getEuRegion().getAchievementMediaById("15092"));
    }

    @Order(7)
    @Test
    void getAchievements() {
        assertNotNull(jbcl.getEuRegion().getAchievements());
        assertTrue(jbcl.getEuRegion().getAchievements().size() > 0);
        System.out.println(jbcl.getEuRegion().getAchievements());

    }

    @Order(8)
    @Test
    void getAuctions() {
        assertNotNull(jbcl.getEuRegion().getAuctions("509"));
        assertTrue(jbcl.getEuRegion().getAuctions("509").size() > 0);
        System.out.println(jbcl.getEuRegion().getAuctions("509"));
    }

    @Order(9)
    @Test
    void getAzeriteEssenceList() {
        assertNotNull(jbcl.getEuRegion().getAzeriteEssence());
        assertTrue(jbcl.getEuRegion().getAzeriteEssence().size() > 0);
        System.out.println(jbcl.getEuRegion().getAzeriteEssence());
    }

    @Order(10)
    @Test
    void getAzeriteEssenceById() {
        assertNotNull(jbcl.getEuRegion().getAzeriteEssenceById("32"));
        System.out.println(jbcl.getEuRegion().getAzeriteEssenceById("32"));
    }

    @Order(11)
    @Test
    void getAzeriteEssenceMediaById() {
        assertNotNull(jbcl.getEuRegion().getAchievementMediaById("32"));
        System.out.println(jbcl.getEuRegion().getAchievementMediaById("32"));
    }
}