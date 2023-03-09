package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRoutingFormSubmissionsUuidErrorResponse
 * Error Object
**/
public class GetRoutingFormSubmissionsUuidErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetRoutingFormSubmissionsUuidErrorResponseDetails[] details;
    public GetRoutingFormSubmissionsUuidErrorResponse withDetails(GetRoutingFormSubmissionsUuidErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetRoutingFormSubmissionsUuidErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetRoutingFormSubmissionsUuidErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}