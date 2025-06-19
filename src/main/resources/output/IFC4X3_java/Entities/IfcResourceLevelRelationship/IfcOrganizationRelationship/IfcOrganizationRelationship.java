public class IfcOrganizationRelationship extends IfcResourceLevelRelationship {
    public IfcOrganization RelatingOrganization;
    public SET [1:?] OF IfcOrganization RelatedOrganizations;
}
