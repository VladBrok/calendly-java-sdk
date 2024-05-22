/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class ListScheduledEventsRequest {
    /**
     * The number of rows to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Integer count;
    public ListScheduledEventsRequest withCount(Integer count) {
        this.count = count;
        return this;
    }
    
    /**
     * Return events that are scheduled with the invitee associated with this email address
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=invitee_email")
    public String inviteeEmail;
    public ListScheduledEventsRequest withInviteeEmail(String inviteeEmail) {
        this.inviteeEmail = inviteeEmail;
        return this;
    }
    
    /**
     * Include events with start times prior to this time (sample time format: "2020-01-02T03:04:05.678123Z"). This time should use the UTC timezone.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=max_start_time")
    public String maxStartTime;
    public ListScheduledEventsRequest withMaxStartTime(String maxStartTime) {
        this.maxStartTime = maxStartTime;
        return this;
    }
    
    /**
     * Include events with start times after this time (sample time format: "2020-01-02T03:04:05.678123Z"). This time should use the UTC timezone.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=min_start_time")
    public String minStartTime;
    public ListScheduledEventsRequest withMinStartTime(String minStartTime) {
        this.minStartTime = minStartTime;
        return this;
    }
    
    /**
     * Return events that are scheduled with the organization associated with this URI
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=organization")
    public String organization;
    public ListScheduledEventsRequest withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    /**
     * The token to pass to get the next or previous portion of the collection
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public ListScheduledEventsRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    /**
     * Order results by the specified field and direction. Accepts comma-separated list of {field}:{direction} values.
     * Supported fields are: start_time.
     * Sort direction is specified as: asc, desc.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;
    public ListScheduledEventsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    /**
     * Whether the scheduled event is `active` or `canceled`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    public ListScheduledEventsStatusEnum status;
    public ListScheduledEventsRequest withStatus(ListScheduledEventsStatusEnum status) {
        this.status = status;
        return this;
    }
    
    /**
     * Return events that are scheduled with the user associated with this URI
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user")
    public String user;
    public ListScheduledEventsRequest withUser(String user) {
        this.user = user;
        return this;
    }
    
}
