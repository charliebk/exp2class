public class IfcActorRole {
    public IfcRoleEnum Role;
    public IfcLabel UserDefinedRole;
    public IfcText Description;

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects

    // === WHERE CLAUSES ===
    // WR1 : (Role <> IfcRoleEnum.USERDEFINED) OR ((Role = IfcRoleEnum.USERDEFINED) AND EXISTS(SELF.UserDefinedRole))
}
