package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetInviteesErrorResponse
 * Error Object
**/
public class GetInviteesErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetInviteesErrorResponseDetails[] details;
    public GetInviteesErrorResponse withDetails(GetInviteesErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetInviteesErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetInviteesErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
