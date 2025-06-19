public class IfcOrganization
{
    public IfcIdentifier Identification { get; set; }
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public List<IfcActorRole> Roles { get; set; }
    public List<IfcAddress> Addresses { get; set; }

    // === INVERSE CLAUSES ===
    // IsRelatedBy : SET [0:?] OF IfcOrganizationRelationship FOR RelatedOrganizations
    // Relates : SET [0:?] OF IfcOrganizationRelationship FOR RelatingOrganization
    // Engages : SET [0:?] OF IfcPersonAndOrganization FOR TheOrganization
}
