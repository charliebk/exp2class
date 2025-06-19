public class IfcOrganizationRelationship : IfcResourceLevelRelationship
{
    public IfcOrganization RelatingOrganization { get; set; }
    public SET [1:?] OF IfcOrganization RelatedOrganizations { get; set; }
}
