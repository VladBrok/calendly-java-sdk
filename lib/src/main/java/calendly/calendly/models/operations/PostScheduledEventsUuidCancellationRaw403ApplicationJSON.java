package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostScheduledEventsUuidCancellationRaw403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public PostScheduledEventsUuidCancellationRaw403ApplicationJSONMessageEnum message;
    public PostScheduledEventsUuidCancellationRaw403ApplicationJSON withMessage(PostScheduledEventsUuidCancellationRaw403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public PostScheduledEventsUuidCancellationRaw403ApplicationJSONTitleEnum title;
    public PostScheduledEventsUuidCancellationRaw403ApplicationJSON withTitle(PostScheduledEventsUuidCancellationRaw403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}