package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * InviteeNoShow
 * Information about an invitees no show.
**/
public class InviteeNoShow {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public InviteeNoShow withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("invitee")
    public String invitee;
    public InviteeNoShow withInvitee(String invitee) {
        this.invitee = invitee;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public InviteeNoShow withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
