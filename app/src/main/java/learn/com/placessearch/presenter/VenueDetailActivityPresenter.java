package learn.com.placessearch.presenter;

import java.util.List;

import learn.com.placessearch.model.Category;
import learn.com.placessearch.model.Contact;
import learn.com.placessearch.model.Venue;
import learn.com.placessearch.view.VenueDetailActivityView;

/**
 * Created by muhammad ali
 * on 23/05/2016.
 */
public class VenueDetailActivityPresenter {

    private VenueDetailActivityView venueDetailActivityView;

    public VenueDetailActivityPresenter(VenueDetailActivityView venueDetailActivityView) {
        this.venueDetailActivityView = venueDetailActivityView;
    }

    public void setData(Venue venue) {
        if (venueDetailActivityView != null) {
            venueDetailActivityView.setVenueName(venue.getName());
            if (venue.getContact() != null) {
                Contact contact = venue.getContact();
                venueDetailActivityView.setVenuePhoneNo(contact.getPhone());
                venueDetailActivityView.setVenueTwitterAddress(contact.getTwitter());
            }

            learn.com.placessearch.model.Location location = venue.getLocation();
            if (location != null) {
                String address = location.getAddress() != null ? location.getAddress() : "";
                String postCode = location.getPostalCode() != null ? location.getPostalCode() : "";
                String city = location.getCity() != null ? location.getCity() : "";
                String country = location.getCountry() != null ? location.getCountry() : "";
                String completeAddress = address.concat(" ").concat(postCode).concat(" ").concat(city).concat(" ").concat(country);
                venueDetailActivityView.setVenueAddress(completeAddress);
            }
            List<Category> categoryList = venue.getCategories();
            if (categoryList.size() > 0) {
                Category category = categoryList.get(0);
                if (category != null) {
                    venueDetailActivityView.setVenueCategory(category.getName());
                }
            }
        }
    }
}
