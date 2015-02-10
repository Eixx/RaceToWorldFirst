
package android.cpe.first.world.to.race.racetoworldfirst.wowapi.model.playerachievement;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Achievements {

    @Expose
    private List<Long> achievementsCompleted = new ArrayList<Long>();
    @Expose
    private List<Long> achievementsCompletedTimestamp = new ArrayList<Long>();
    @Expose
    private List<Long> criteria = new ArrayList<Long>();
    @Expose
    private List<Long> criteriaQuantity = new ArrayList<Long>();
    @Expose
    private List<Long> criteriaTimestamp = new ArrayList<Long>();

    /**
     * 
     * @return
     *     The achievementsCompleted
     */
    public List<Long> getAchievementsCompleted() {
        return achievementsCompleted;
    }

    /**
     * 
     * @param achievementsCompleted
     *     The achievementsCompleted
     */
    public void setAchievementsCompleted(List<Long> achievementsCompleted) {
        this.achievementsCompleted = achievementsCompleted;
    }

    /**
     * 
     * @return
     *     The achievementsCompletedTimestamp
     */
    public List<Long> getAchievementsCompletedTimestamp() {
        return achievementsCompletedTimestamp;
    }

    /**
     * 
     * @param achievementsCompletedTimestamp
     *     The achievementsCompletedTimestamp
     */
    public void setAchievementsCompletedTimestamp(List<Long> achievementsCompletedTimestamp) {
        this.achievementsCompletedTimestamp = achievementsCompletedTimestamp;
    }

    /**
     * 
     * @return
     *     The criteria
     */
    public List<Long> getCriteria() {
        return criteria;
    }

    /**
     * 
     * @param criteria
     *     The criteria
     */
    public void setCriteria(List<Long> criteria) {
        this.criteria = criteria;
    }

    /**
     * 
     * @return
     *     The criteriaQuantity
     */
    public List<Long> getCriteriaQuantity() {
        return criteriaQuantity;
    }

    /**
     * 
     * @param criteriaQuantity
     *     The criteriaQuantity
     */
    public void setCriteriaQuantity(List<Long> criteriaQuantity) {
        this.criteriaQuantity = criteriaQuantity;
    }

    /**
     * 
     * @return
     *     The criteriaTimestamp
     */
    public List<Long> getCriteriaTimestamp() {
        return criteriaTimestamp;
    }

    /**
     * 
     * @param criteriaTimestamp
     *     The criteriaTimestamp
     */
    public void setCriteriaTimestamp(List<Long> criteriaTimestamp) {
        this.criteriaTimestamp = criteriaTimestamp;
    }

}
