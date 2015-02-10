
package android.cpe.first.world.to.race.racetoworldfirst.wowapi.model.guildmember;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Character {

    @Expose
    private String name;
    @Expose
    private String realm;
    @Expose
    private String battlegroup;
    @SerializedName("class")
    @Expose
    private Long _class;
    @Expose
    private Long race;
    @Expose
    private Long gender;
    @Expose
    private Long level;
    @Expose
    private Long achievementPoints;
    @Expose
    private String thumbnail;
    @Expose
    private Spec spec;
    @Expose
    private String guild;
    @Expose
    private String guildRealm;

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
     *     The _class
     */
    public Long getClass_() {
        return _class;
    }

    /**
     * 
     * @param _class
     *     The class
     */
    public void setClass_(Long _class) {
        this._class = _class;
    }

    /**
     * 
     * @return
     *     The race
     */
    public Long getRace() {
        return race;
    }

    /**
     * 
     * @param race
     *     The race
     */
    public void setRace(Long race) {
        this.race = race;
    }

    /**
     * 
     * @return
     *     The gender
     */
    public Long getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    public void setGender(Long gender) {
        this.gender = gender;
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
     *     The thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 
     * @param thumbnail
     *     The thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 
     * @return
     *     The spec
     */
    public Spec getSpec() {
        return spec;
    }

    /**
     * 
     * @param spec
     *     The spec
     */
    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    /**
     * 
     * @return
     *     The guild
     */
    public String getGuild() {
        return guild;
    }

    /**
     * 
     * @param guild
     *     The guild
     */
    public void setGuild(String guild) {
        this.guild = guild;
    }

    /**
     * 
     * @return
     *     The guildRealm
     */
    public String getGuildRealm() {
        return guildRealm;
    }

    /**
     * 
     * @param guildRealm
     *     The guildRealm
     */
    public void setGuildRealm(String guildRealm) {
        this.guildRealm = guildRealm;
    }

}
