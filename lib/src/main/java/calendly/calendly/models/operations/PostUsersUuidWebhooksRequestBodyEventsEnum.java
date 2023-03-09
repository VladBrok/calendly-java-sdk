package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostUsersUuidWebhooksRequestBodyEventsEnum {
    INVITEE_CANCELED("invitee.canceled"),
    INVITEE_CREATED("invitee.created"),
    ROUTING_FORM_SUBMISSION_CREATED("routing_form_submission.created");

    @JsonValue
    public final String value;

    private PostUsersUuidWebhooksRequestBodyEventsEnum(String value) {
        this.value = value;
    }
}
