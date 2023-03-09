package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RevokeUsersOrganizationInvitation403ApplicationJSONMessageEnum {
    YOU_CANNOT_PERFORM_THIS_ACTION_FOR_AN_ORGANIZATION_WITH_SCIM_ENABLED("You cannot perform this action for an organization with SCIM enabled."),
    YOU_DO_NOT_HAVE_PERMISSION("You do not have permission"),
    YOU_DO_NOT_HAVE_PERMISSION_TO_ACCESS_THIS_RESOURCE("You do not have permission to access this resource.");

    @JsonValue
    public final String value;

    private RevokeUsersOrganizationInvitation403ApplicationJSONMessageEnum(String value) {
        this.value = value;
    }
}