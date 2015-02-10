
package android.cpe.first.world.to.race.racetoworldfirst.wowapi.model.guildmember;

import com.google.gson.annotations.Expose;

public class Spec {

    @Expose
    private String name;
    @Expose
    private String role;
    @Expose
    private String backgroundImage;
    @Expose
    private String icon;
    @Expose
    private String description;
    @Expose
    private Long order;

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
     *     The role
     */
    public String getRole() {
        return role;
    }

    /**
     * 
     * @param role
     *     The role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 
     * @return
     *     The backgroundImage
     */
    public String getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * 
     * @param backgroundImage
     *     The backgroundImage
     */
    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    /**
     * 
     * @return
     *     The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The order
     */
    public Long getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    public void setOrder(Long order) {
        this.order = order;
    }

}
