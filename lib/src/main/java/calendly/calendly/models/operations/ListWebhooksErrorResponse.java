/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListWebhooksErrorResponse - Error Object
 */
public class ListWebhooksErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public ListWebhooksErrorResponseDetails[] details;
    public ListWebhooksErrorResponse withDetails(ListWebhooksErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public ListWebhooksErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public ListWebhooksErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}