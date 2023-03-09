package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserAvailabilitySchedulesUuidErrorResponse
 * Error Object
**/
public class GetUserAvailabilitySchedulesUuidErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetUserAvailabilitySchedulesUuidErrorResponseDetails[] details;
    public GetUserAvailabilitySchedulesUuidErrorResponse withDetails(GetUserAvailabilitySchedulesUuidErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetUserAvailabilitySchedulesUuidErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetUserAvailabilitySchedulesUuidErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
