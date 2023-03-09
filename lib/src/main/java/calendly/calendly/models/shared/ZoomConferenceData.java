package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ZoomConferenceData
 * The conference metadata supplied by Zoom
**/
public class ZoomConferenceData {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extra")
    public ZoomConferenceDataExtra extra;
    public ZoomConferenceData withExtra(ZoomConferenceDataExtra extra) {
        this.extra = extra;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ZoomConferenceData withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public ZoomConferenceData withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    public ZoomConferenceDataSettings settings;
    public ZoomConferenceData withSettings(ZoomConferenceDataSettings settings) {
        this.settings = settings;
        return this;
    }
    
}
