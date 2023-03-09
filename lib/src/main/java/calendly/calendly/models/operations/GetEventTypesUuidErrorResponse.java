package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetEventTypesUuidErrorResponse
 * Error Object
**/
public class GetEventTypesUuidErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetEventTypesUuidErrorResponseDetails[] details;
    public GetEventTypesUuidErrorResponse withDetails(GetEventTypesUuidErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetEventTypesUuidErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetEventTypesUuidErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
