package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetInvitees200ApplicationJSON
 * Service response
**/
public class GetInvitees200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.Invitee[] collection;
    public GetInvitees200ApplicationJSON withCollection(calendly.calendly.models.shared.Invitee[] collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonProperty("pagination")
    public calendly.calendly.models.shared.Pagination pagination;
    public GetInvitees200ApplicationJSON withPagination(calendly.calendly.models.shared.Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
}
