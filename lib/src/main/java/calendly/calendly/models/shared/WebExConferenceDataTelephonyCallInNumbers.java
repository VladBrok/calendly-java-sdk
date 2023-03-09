package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebExConferenceDataTelephonyCallInNumbers {
    @JsonProperty("callInNumber")
    public String callInNumber;
    public WebExConferenceDataTelephonyCallInNumbers withCallInNumber(String callInNumber) {
        this.callInNumber = callInNumber;
        return this;
    }
    
    @JsonProperty("label")
    public String label;
    public WebExConferenceDataTelephonyCallInNumbers withLabel(String label) {
        this.label = label;
        return this;
    }
    
    @JsonProperty("tollType")
    public String tollType;
    public WebExConferenceDataTelephonyCallInNumbers withTollType(String tollType) {
        this.tollType = tollType;
        return this;
    }
    
}
