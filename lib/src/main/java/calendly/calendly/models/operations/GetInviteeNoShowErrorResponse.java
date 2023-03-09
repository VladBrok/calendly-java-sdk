package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetInviteeNoShowErrorResponse
 * Error Object
**/
public class GetInviteeNoShowErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetInviteeNoShowErrorResponseDetails[] details;
    public GetInviteeNoShowErrorResponse withDetails(GetInviteeNoShowErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetInviteeNoShowErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetInviteeNoShowErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
