public class IfcActorRole
{
    public IfcRoleEnum Role { get; set; }
    public IfcLabel UserDefinedRole { get; set; }
    public IfcText Description { get; set; }

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects

    // === WHERE CLAUSES ===
    // WR1 : (Role <> IfcRoleEnum.USERDEFINED) OR ((Role = IfcRoleEnum.USERDEFINED) AND EXISTS(SELF.UserDefinedRole))
}
