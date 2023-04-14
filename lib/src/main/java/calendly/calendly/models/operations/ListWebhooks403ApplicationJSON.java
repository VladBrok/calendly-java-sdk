/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListWebhooks403ApplicationJSON - Permission Denied
 */
public class ListWebhooks403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public ListWebhooks403ApplicationJSONMessageEnum message;
    public ListWebhooks403ApplicationJSON withMessage(ListWebhooks403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public ListWebhooks403ApplicationJSONTitleEnum title;
    public ListWebhooks403ApplicationJSON withTitle(ListWebhooks403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}