
package learn.com.placessearch.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Stats implements Serializable {

    @SerializedName("checkinsCount")
    @Expose
    private Integer checkinsCount;
    @SerializedName("usersCount")
    @Expose
    private Integer usersCount;
    @SerializedName("tipCount")
    @Expose
    private Integer tipCount;

    /**
     * 
     * @return
     *     The checkinsCount
     */
    public Integer getCheckinsCount() {
        return checkinsCount;
    }

    /**
     * 
     * @param checkinsCount
     *     The checkinsCount
     */
    public void setCheckinsCount(Integer checkinsCount) {
        this.checkinsCount = checkinsCount;
    }

    /**
     * 
     * @return
     *     The usersCount
     */
    public Integer getUsersCount() {
        return usersCount;
    }

    /**
     * 
     * @param usersCount
     *     The usersCount
     */
    public void setUsersCount(Integer usersCount) {
        this.usersCount = usersCount;
    }

    /**
     * 
     * @return
     *     The tipCount
     */
    public Integer getTipCount() {
        return tipCount;
    }

    /**
     * 
     * @param tipCount
     *     The tipCount
     */
    public void setTipCount(Integer tipCount) {
        this.tipCount = tipCount;
    }

}
