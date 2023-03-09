package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class ShareShareOverrideAvailabilityRuleRules {
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("date")
    public LocalDate date;
    public ShareShareOverrideAvailabilityRuleRules withDate(LocalDate date) {
        this.date = date;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("intervals")
    public ShareShareOverrideAvailabilityRuleRulesIntervals[] intervals;
    public ShareShareOverrideAvailabilityRuleRules withIntervals(ShareShareOverrideAvailabilityRuleRulesIntervals[] intervals) {
        this.intervals = intervals;
        return this;
    }
    
    @JsonProperty("type")
    public ShareShareOverrideAvailabilityRuleRulesTypeEnum type;
    public ShareShareOverrideAvailabilityRuleRules withType(ShareShareOverrideAvailabilityRuleRulesTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wday")
    public ShareShareOverrideAvailabilityRuleRulesWdayEnum wday;
    public ShareShareOverrideAvailabilityRuleRules withWday(ShareShareOverrideAvailabilityRuleRulesWdayEnum wday) {
        this.wday = wday;
        return this;
    }
    
}
