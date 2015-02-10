
package android.cpe.first.world.to.race.racetoworldfirst.wowapi.model.playerachievement;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AchievementResponse {

    @Expose
    private Long lastModified;
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
    private String calcClass;
    @Expose
    private Achievements achievements;
    @Expose
    private Long totalHonorableKills;

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
     *     The calcClass
     */
    public String getCalcClass() {
        return calcClass;
    }

    /**
     * 
     * @param calcClass
     *     The calcClass
     */
    public void setCalcClass(String calcClass) {
        this.calcClass = calcClass;
    }

    /**
     * 
     * @return
     *     The achievements
     */
    public Achievements getAchievements() {
        return achievements;
    }

    /**
     * 
     * @param achievements
     *     The achievements
     */
    public void setAchievements(Achievements achievements) {
        this.achievements = achievements;
    }

    /**
     * 
     * @return
     *     The totalHonorableKills
     */
    public Long getTotalHonorableKills() {
        return totalHonorableKills;
    }

    /**
     * 
     * @param totalHonorableKills
     *     The totalHonorableKills
     */
    public void setTotalHonorableKills(Long totalHonorableKills) {
        this.totalHonorableKills = totalHonorableKills;
    }

	@Override
	public String toString() {
		return "AchievementResult [lastModified=" + lastModified + ", name="
				+ name + ", realm=" + realm + ", battlegroup=" + battlegroup
				+ ", _class=" + _class + ", race=" + race + ", gender="
				+ gender + ", level=" + level + ", achievementPoints="
				+ achievementPoints + ", thumbnail=" + thumbnail
				+ ", calcClass=" + calcClass + ", achievements=" + achievements
				+ ", totalHonorableKills=" + totalHonorableKills + "]";
	}
    
    

}
