package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ShareShareOverrideAvailabilityRuleRulesWdayEnum {
    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    @JsonValue
    public final String value;

    private ShareShareOverrideAvailabilityRuleRulesWdayEnum(String value) {
        this.value = value;
    }
}
