package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRoutingFormSubmissionsErrorResponse
 * Error Object
**/
public class GetRoutingFormSubmissionsErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetRoutingFormSubmissionsErrorResponseDetails[] details;
    public GetRoutingFormSubmissionsErrorResponse withDetails(GetRoutingFormSubmissionsErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetRoutingFormSubmissionsErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetRoutingFormSubmissionsErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
