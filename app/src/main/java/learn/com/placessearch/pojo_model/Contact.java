
package learn.com.placessearch.pojo_model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Contact implements Serializable {

    @SerializedName("phone")
    @Expose
    private String phone;


    @SerializedName("formattedPhone")
    @Expose
    private String formattedPhone;

    @SerializedName("twitter")
    @Expose
    private String twitter;


    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * @return The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return The formattedPhone
     */
    public String getFormattedPhone() {
        return formattedPhone;
    }

    /**
     * @param formattedPhone The formattedPhone
     */
    public void setFormattedPhone(String formattedPhone) {
        this.formattedPhone = formattedPhone;
    }

}
