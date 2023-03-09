package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetInvitees403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public GetInvitees403ApplicationJSONMessageEnum message;
    public GetInvitees403ApplicationJSON withMessage(GetInvitees403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public GetInvitees403ApplicationJSONTitleEnum title;
    public GetInvitees403ApplicationJSON withTitle(GetInvitees403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
