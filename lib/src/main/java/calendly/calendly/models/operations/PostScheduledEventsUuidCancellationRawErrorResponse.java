package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostScheduledEventsUuidCancellationRawErrorResponse
 * Error Object
**/
public class PostScheduledEventsUuidCancellationRawErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public PostScheduledEventsUuidCancellationRawErrorResponseDetails[] details;
    public PostScheduledEventsUuidCancellationRawErrorResponse withDetails(PostScheduledEventsUuidCancellationRawErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public PostScheduledEventsUuidCancellationRawErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public PostScheduledEventsUuidCancellationRawErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
