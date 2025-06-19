public class IfcOrganization {
    public IfcIdentifier Identification;
    public IfcLabel Name;
    public IfcText Description;
    public List<IfcActorRole> Roles;
    public List<IfcAddress> Addresses;

    // === INVERSE CLAUSES ===
    // IsRelatedBy : SET [0:?] OF IfcOrganizationRelationship FOR RelatedOrganizations
    // Relates : SET [0:?] OF IfcOrganizationRelationship FOR RelatingOrganization
    // Engages : SET [0:?] OF IfcPersonAndOrganization FOR TheOrganization
}
