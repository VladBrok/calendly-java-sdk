package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShareShareOverrideAvailabilityRule {
    @JsonProperty("rules")
    public ShareShareOverrideAvailabilityRuleRules[] rules;
    public ShareShareOverrideAvailabilityRule withRules(ShareShareOverrideAvailabilityRuleRules[] rules) {
        this.rules = rules;
        return this;
    }
    
    @JsonProperty("timezone")
    public String timezone;
    public ShareShareOverrideAvailabilityRule withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
}
