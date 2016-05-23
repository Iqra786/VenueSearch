
package learn.com.placessearch.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Feature implements Serializable {

    @SerializedName("cc")
    @Expose
    private String cc;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("matchedName")
    @Expose
    private String matchedName;
    @SerializedName("highlightedName")
    @Expose
    private String highlightedName;
    @SerializedName("woeType")
    @Expose
    private Integer woeType;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("longId")
    @Expose
    private String longId;
    @SerializedName("geometry")
    @Expose
    private Geometry geometry;

    /**
     * 
     * @return
     *     The cc
     */
    public String getCc() {
        return cc;
    }

    /**
     * 
     * @param cc
     *     The cc
     */
    public void setCc(String cc) {
        this.cc = cc;
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
     *     The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The matchedName
     */
    public String getMatchedName() {
        return matchedName;
    }

    /**
     * 
     * @param matchedName
     *     The matchedName
     */
    public void setMatchedName(String matchedName) {
        this.matchedName = matchedName;
    }

    /**
     * 
     * @return
     *     The highlightedName
     */
    public String getHighlightedName() {
        return highlightedName;
    }

    /**
     * 
     * @param highlightedName
     *     The highlightedName
     */
    public void setHighlightedName(String highlightedName) {
        this.highlightedName = highlightedName;
    }

    /**
     * 
     * @return
     *     The woeType
     */
    public Integer getWoeType() {
        return woeType;
    }

    /**
     * 
     * @param woeType
     *     The woeType
     */
    public void setWoeType(Integer woeType) {
        this.woeType = woeType;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The longId
     */
    public String getLongId() {
        return longId;
    }

    /**
     * 
     * @param longId
     *     The longId
     */
    public void setLongId(String longId) {
        this.longId = longId;
    }

    /**
     * 
     * @return
     *     The geometry
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * 
     * @param geometry
     *     The geometry
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

}
