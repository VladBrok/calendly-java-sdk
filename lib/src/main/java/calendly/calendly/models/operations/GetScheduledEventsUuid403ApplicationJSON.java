package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetScheduledEventsUuid403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public GetScheduledEventsUuid403ApplicationJSONMessageEnum message;
    public GetScheduledEventsUuid403ApplicationJSON withMessage(GetScheduledEventsUuid403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public GetScheduledEventsUuid403ApplicationJSONTitleEnum title;
    public GetScheduledEventsUuid403ApplicationJSON withTitle(GetScheduledEventsUuid403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}