
package android.cpe.first.world.to.race.racetoworldfirst.wowapi.model.guildmember;

import com.google.gson.annotations.Expose;

public class Emblem {

    @Expose
    private Long icon;
    @Expose
    private String iconColor;
    @Expose
    private Long border;
    @Expose
    private String borderColor;
    @Expose
    private String backgroundColor;

    /**
     * 
     * @return
     *     The icon
     */
    public Long getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(Long icon) {
        this.icon = icon;
    }

    /**
     * 
     * @return
     *     The iconColor
     */
    public String getIconColor() {
        return iconColor;
    }

    /**
     * 
     * @param iconColor
     *     The iconColor
     */
    public void setIconColor(String iconColor) {
        this.iconColor = iconColor;
    }

    /**
     * 
     * @return
     *     The border
     */
    public Long getBorder() {
        return border;
    }

    /**
     * 
     * @param border
     *     The border
     */
    public void setBorder(Long border) {
        this.border = border;
    }

    /**
     * 
     * @return
     *     The borderColor
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * 
     * @param borderColor
     *     The borderColor
     */
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * 
     * @return
     *     The backgroundColor
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 
     * @param backgroundColor
     *     The backgroundColor
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

}
