package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetEventTypeAvailableTimesErrorResponse
 * Error Object
**/
public class GetEventTypeAvailableTimesErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetEventTypeAvailableTimesErrorResponseDetails[] details;
    public GetEventTypeAvailableTimesErrorResponse withDetails(GetEventTypeAvailableTimesErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetEventTypeAvailableTimesErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetEventTypeAvailableTimesErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
