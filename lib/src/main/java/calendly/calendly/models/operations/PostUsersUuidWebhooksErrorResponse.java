package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostUsersUuidWebhooksErrorResponse
 * Error Object
**/
public class PostUsersUuidWebhooksErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public PostUsersUuidWebhooksErrorResponseDetails[] details;
    public PostUsersUuidWebhooksErrorResponse withDetails(PostUsersUuidWebhooksErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public PostUsersUuidWebhooksErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public PostUsersUuidWebhooksErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
