package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetUserAvailabilitySchedulesUuid403ApplicationJSONMessageEnum {
    THIS_USER_IS_NOT_IN_YOUR_ORGANIZATION("This user is not in your organization");

    @JsonValue
    public final String value;

    private GetUserAvailabilitySchedulesUuid403ApplicationJSONMessageEnum(String value) {
        this.value = value;
    }
}
