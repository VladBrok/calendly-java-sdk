package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostScheduledEventsUuidCancellationMultipart403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public PostScheduledEventsUuidCancellationMultipart403ApplicationJSONMessageEnum message;
    public PostScheduledEventsUuidCancellationMultipart403ApplicationJSON withMessage(PostScheduledEventsUuidCancellationMultipart403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public PostScheduledEventsUuidCancellationMultipart403ApplicationJSONTitleEnum title;
    public PostScheduledEventsUuidCancellationMultipart403ApplicationJSON withTitle(PostScheduledEventsUuidCancellationMultipart403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
