package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostInviteeNoShowErrorResponse
 * Error Object
**/
public class PostInviteeNoShowErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public PostInviteeNoShowErrorResponseDetails[] details;
    public PostInviteeNoShowErrorResponse withDetails(PostInviteeNoShowErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public PostInviteeNoShowErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public PostInviteeNoShowErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
