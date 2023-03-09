package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AvailabilityRuleIntervals {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public String from;
    public AvailabilityRuleIntervals withFrom(String from) {
        this.from = from;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("to")
    public String to;
    public AvailabilityRuleIntervals withTo(String to) {
        this.to = to;
        return this;
    }
    
}
