package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class RevokeUsersOrganizationInvitationResponse {
    public String contentType;
    public RevokeUsersOrganizationInvitationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public RevokeUsersOrganizationInvitationErrorResponse errorResponse1;
    public RevokeUsersOrganizationInvitationResponse withErrorResponse1(RevokeUsersOrganizationInvitationErrorResponse errorResponse1) {
        this.errorResponse1 = errorResponse1;
        return this;
    }
    
    public calendly.calendly.models.shared.ErrorResponse errorResponse;
    public RevokeUsersOrganizationInvitationResponse withErrorResponse(calendly.calendly.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public RevokeUsersOrganizationInvitationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RevokeUsersOrganizationInvitationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public RevokeUsersOrganizationInvitation403ApplicationJSON revokeUsersOrganizationInvitation403ApplicationJSONObject;
    public RevokeUsersOrganizationInvitationResponse withRevokeUsersOrganizationInvitation403ApplicationJSONObject(RevokeUsersOrganizationInvitation403ApplicationJSON revokeUsersOrganizationInvitation403ApplicationJSONObject) {
        this.revokeUsersOrganizationInvitation403ApplicationJSONObject = revokeUsersOrganizationInvitation403ApplicationJSONObject;
        return this;
    }
    
}
