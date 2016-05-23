
package learn.com.placessearch.pojo_model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Response {

    @SerializedName("venues")
    @Expose
    private List<Venue> venues = new ArrayList<Venue>();
    @SerializedName("confident")
    @Expose
    private Boolean confident;
    @SerializedName("geocode")
    @Expose
    private Geocode geocode;

    /**
     * 
     * @return
     *     The venues
     */
    public List<Venue> getVenues() {
        return venues;
    }

    /**
     * 
     * @param venues
     *     The venues
     */
    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

    /**
     * 
     * @return
     *     The confident
     */
    public Boolean getConfident() {
        return confident;
    }

    /**
     * 
     * @param confident
     *     The confident
     */
    public void setConfident(Boolean confident) {
        this.confident = confident;
    }

    /**
     * 
     * @return
     *     The geocode
     */
    public Geocode getGeocode() {
        return geocode;
    }

    /**
     * 
     * @param geocode
     *     The geocode
     */
    public void setGeocode(Geocode geocode) {
        this.geocode = geocode;
    }

}
