package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ZoomConferenceDataSettingsGlobalDialInNumbers {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    public String city;
    public ZoomConferenceDataSettingsGlobalDialInNumbers withCity(String city) {
        this.city = city;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    public String country;
    public ZoomConferenceDataSettingsGlobalDialInNumbers withCountry(String country) {
        this.country = country;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country_name")
    public String countryName;
    public ZoomConferenceDataSettingsGlobalDialInNumbers withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("number")
    public String number;
    public ZoomConferenceDataSettingsGlobalDialInNumbers withNumber(String number) {
        this.number = number;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;
    public ZoomConferenceDataSettingsGlobalDialInNumbers withType(String type) {
        this.type = type;
        return this;
    }
    
}
