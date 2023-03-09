package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GoogleConferenceStatusEnum {
    INITIATED("initiated"),
    PROCESSING("processing"),
    PUSHED("pushed"),
    FAILED("failed");

    @JsonValue
    public final String value;

    private GoogleConferenceStatusEnum(String value) {
        this.value = value;
    }
}
