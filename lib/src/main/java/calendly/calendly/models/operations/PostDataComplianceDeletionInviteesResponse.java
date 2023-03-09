package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class PostDataComplianceDeletionInviteesResponse {
    public String contentType;
    public PostDataComplianceDeletionInviteesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public PostDataComplianceDeletionInviteesErrorResponse errorResponse;
    public PostDataComplianceDeletionInviteesResponse withErrorResponse(PostDataComplianceDeletionInviteesErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public calendly.calendly.models.shared.ErrorResponse errorResponse1;
    public PostDataComplianceDeletionInviteesResponse withErrorResponse1(calendly.calendly.models.shared.ErrorResponse errorResponse1) {
        this.errorResponse1 = errorResponse1;
        return this;
    }
    
    public Integer statusCode;
    public PostDataComplianceDeletionInviteesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public PostDataComplianceDeletionInviteesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public java.util.Map<String, Object> postDataComplianceDeletionInvitees202ApplicationJSONObject;
    public PostDataComplianceDeletionInviteesResponse withPostDataComplianceDeletionInvitees202ApplicationJSONObject(java.util.Map<String, Object> postDataComplianceDeletionInvitees202ApplicationJSONObject) {
        this.postDataComplianceDeletionInvitees202ApplicationJSONObject = postDataComplianceDeletionInvitees202ApplicationJSONObject;
        return this;
    }
    
}
