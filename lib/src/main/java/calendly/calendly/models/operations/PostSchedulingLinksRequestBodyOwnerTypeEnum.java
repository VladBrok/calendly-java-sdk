package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostSchedulingLinksRequestBodyOwnerTypeEnum {
    EVENT_TYPE("EventType");

    @JsonValue
    public final String value;

    private PostSchedulingLinksRequestBodyOwnerTypeEnum(String value) {
        this.value = value;
    }
}
