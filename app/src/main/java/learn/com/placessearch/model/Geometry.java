
package learn.com.placessearch.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Geometry implements Serializable {

    @SerializedName("center")
    @Expose
    private Center center;
    @SerializedName("bounds")
    @Expose
    private Bounds bounds;

    /**
     * 
     * @return
     *     The center
     */
    public Center getCenter() {
        return center;
    }

    /**
     * 
     * @param center
     *     The center
     */
    public void setCenter(Center center) {
        this.center = center;
    }

    /**
     * 
     * @return
     *     The bounds
     */
    public Bounds getBounds() {
        return bounds;
    }

    /**
     * 
     * @param bounds
     *     The bounds
     */
    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

}
