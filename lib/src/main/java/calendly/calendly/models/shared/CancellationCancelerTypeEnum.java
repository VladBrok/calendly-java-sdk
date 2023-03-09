package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum CancellationCancelerTypeEnum {
    HOST("host"),
    INVITEE("invitee");

    @JsonValue
    public final String value;

    private CancellationCancelerTypeEnum(String value) {
        this.value = value;
    }
}
