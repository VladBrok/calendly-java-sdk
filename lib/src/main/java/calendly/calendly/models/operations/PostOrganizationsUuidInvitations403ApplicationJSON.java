package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOrganizationsUuidInvitations403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public PostOrganizationsUuidInvitations403ApplicationJSONMessageEnum message;
    public PostOrganizationsUuidInvitations403ApplicationJSON withMessage(PostOrganizationsUuidInvitations403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public PostOrganizationsUuidInvitations403ApplicationJSONTitleEnum title;
    public PostOrganizationsUuidInvitations403ApplicationJSON withTitle(PostOrganizationsUuidInvitations403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}