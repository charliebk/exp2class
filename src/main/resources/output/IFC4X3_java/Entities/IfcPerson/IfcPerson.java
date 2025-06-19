public class IfcPerson {
    public IfcIdentifier Identification;
    public IfcLabel FamilyName;
    public IfcLabel GivenName;
    public List<IfcLabel> MiddleNames;
    public List<IfcLabel> PrefixTitles;
    public List<IfcLabel> SuffixTitles;
    public List<IfcActorRole> Roles;
    public List<IfcAddress> Addresses;

    // === INVERSE CLAUSES ===
    // EngagedIn : SET [0:?] OF IfcPersonAndOrganization FOR ThePerson

    // === WHERE CLAUSES ===
    // IdentifiablePerson : EXISTS(Identification) OR EXISTS(FamilyName) OR EXISTS(GivenName)
    // ValidSetOfNames : NOT EXISTS(MiddleNames) OR EXISTS(FamilyName) OR EXISTS(GivenName)
}
