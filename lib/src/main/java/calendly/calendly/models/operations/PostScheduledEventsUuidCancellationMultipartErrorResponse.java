package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostScheduledEventsUuidCancellationMultipartErrorResponse
 * Error Object
**/
public class PostScheduledEventsUuidCancellationMultipartErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public PostScheduledEventsUuidCancellationMultipartErrorResponseDetails[] details;
    public PostScheduledEventsUuidCancellationMultipartErrorResponse withDetails(PostScheduledEventsUuidCancellationMultipartErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public PostScheduledEventsUuidCancellationMultipartErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public PostScheduledEventsUuidCancellationMultipartErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
