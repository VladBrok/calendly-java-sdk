package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Share {
    @JsonProperty("scheduling_links")
    public ShareSchedulingLinks[] schedulingLinks;
    public Share withSchedulingLinks(ShareSchedulingLinks[] schedulingLinks) {
        this.schedulingLinks = schedulingLinks;
        return this;
    }
    
    @JsonProperty("share_override")
    public ShareShareOverride shareOverride;
    public Share withShareOverride(ShareShareOverride shareOverride) {
        this.shareOverride = shareOverride;
        return this;
    }
    
}
