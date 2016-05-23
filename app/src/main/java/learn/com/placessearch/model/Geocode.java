
package learn.com.placessearch.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Geocode implements Serializable {

    @SerializedName("what")
    @Expose
    private String what;
    @SerializedName("where")
    @Expose
    private String where;
    @SerializedName("feature")
    @Expose
    private Feature feature;
    @SerializedName("parents")
    @Expose
    private List<Object> parents = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The what
     */
    public String getWhat() {
        return what;
    }

    /**
     * 
     * @param what
     *     The what
     */
    public void setWhat(String what) {
        this.what = what;
    }

    /**
     * 
     * @return
     *     The where
     */
    public String getWhere() {
        return where;
    }

    /**
     * 
     * @param where
     *     The where
     */
    public void setWhere(String where) {
        this.where = where;
    }

    /**
     * 
     * @return
     *     The feature
     */
    public Feature getFeature() {
        return feature;
    }

    /**
     * 
     * @param feature
     *     The feature
     */
    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    /**
     * 
     * @return
     *     The parents
     */
    public List<Object> getParents() {
        return parents;
    }

    /**
     * 
     * @param parents
     *     The parents
     */
    public void setParents(List<Object> parents) {
        this.parents = parents;
    }

}
