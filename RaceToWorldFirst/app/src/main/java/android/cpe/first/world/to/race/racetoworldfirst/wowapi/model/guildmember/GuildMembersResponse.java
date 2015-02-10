
package android.cpe.first.world.to.race.racetoworldfirst.wowapi.model.guildmember;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class GuildMembersResponse {

    @Expose
    private Long lastModified;
    @Expose
    private String name;
    @Expose
    private String realm;
    @Expose
    private String battlegroup;
    @Expose
    private Long level;
    @Expose
    private Long side;
    @Expose
    private Long achievementPoints;
    @Expose
    private List<Member> members = new ArrayList<Member>();
    @Expose
    private Emblem emblem;

    /**
     * 
     * @return
     *     The lastModified
     */
    public Long getLastModified() {
        return lastModified;
    }

    /**
     * 
     * @param lastModified
     *     The lastModified
     */
    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The realm
     */
    public String getRealm() {
        return realm;
    }

    /**
     * 
     * @param realm
     *     The realm
     */
    public void setRealm(String realm) {
        this.realm = realm;
    }

    /**
     * 
     * @return
     *     The battlegroup
     */
    public String getBattlegroup() {
        return battlegroup;
    }

    /**
     * 
     * @param battlegroup
     *     The battlegroup
     */
    public void setBattlegroup(String battlegroup) {
        this.battlegroup = battlegroup;
    }

    /**
     * 
     * @return
     *     The level
     */
    public Long getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(Long level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The side
     */
    public Long getSide() {
        return side;
    }

    /**
     * 
     * @param side
     *     The side
     */
    public void setSide(Long side) {
        this.side = side;
    }

    /**
     * 
     * @return
     *     The achievementPoints
     */
    public Long getAchievementPoints() {
        return achievementPoints;
    }

    /**
     * 
     * @param achievementPoints
     *     The achievementPoints
     */
    public void setAchievementPoints(Long achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    /**
     * 
     * @return
     *     The members
     */
    public List<Member> getMembers() {
        return members;
    }

    /**
     * 
     * @param members
     *     The members
     */
    public void setMembers(List<Member> members) {
        this.members = members;
    }

    /**
     * 
     * @return
     *     The emblem
     */
    public Emblem getEmblem() {
        return emblem;
    }

    /**
     * 
     * @param emblem
     *     The emblem
     */
    public void setEmblem(Emblem emblem) {
        this.emblem = emblem;
    }

}
