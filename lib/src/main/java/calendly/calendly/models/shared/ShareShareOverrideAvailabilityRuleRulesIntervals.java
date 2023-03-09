package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ShareShareOverrideAvailabilityRuleRulesIntervals {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public String from;
    public ShareShareOverrideAvailabilityRuleRulesIntervals withFrom(String from) {
        this.from = from;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("to")
    public String to;
    public ShareShareOverrideAvailabilityRuleRulesIntervals withTo(String to) {
        this.to = to;
        return this;
    }
    
}
