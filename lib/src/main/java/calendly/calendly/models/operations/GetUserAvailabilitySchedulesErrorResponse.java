package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserAvailabilitySchedulesErrorResponse
 * Error Object
**/
public class GetUserAvailabilitySchedulesErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetUserAvailabilitySchedulesErrorResponseDetails[] details;
    public GetUserAvailabilitySchedulesErrorResponse withDetails(GetUserAvailabilitySchedulesErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetUserAvailabilitySchedulesErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetUserAvailabilitySchedulesErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
