public class IfcPerson
{
    public IfcIdentifier Identification { get; set; }
    public IfcLabel FamilyName { get; set; }
    public IfcLabel GivenName { get; set; }
    public List<IfcLabel> MiddleNames { get; set; }
    public List<IfcLabel> PrefixTitles { get; set; }
    public List<IfcLabel> SuffixTitles { get; set; }
    public List<IfcActorRole> Roles { get; set; }
    public List<IfcAddress> Addresses { get; set; }

    // === INVERSE CLAUSES ===
    // EngagedIn : SET [0:?] OF IfcPersonAndOrganization FOR ThePerson

    // === WHERE CLAUSES ===
    // IdentifiablePerson : EXISTS(Identification) OR EXISTS(FamilyName) OR EXISTS(GivenName)
    // ValidSetOfNames : NOT EXISTS(MiddleNames) OR EXISTS(FamilyName) OR EXISTS(GivenName)
}
