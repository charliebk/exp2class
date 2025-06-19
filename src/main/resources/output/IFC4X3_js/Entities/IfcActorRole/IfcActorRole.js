class IfcActorRole {
    constructor() {
        /** @type {IFCROLEENUM} */
        this.Role = null;
        /** @type {IFCLABEL} */
        this.UserDefinedRole = null;
        /** @type {IFCTEXT} */
        this.Description = null;
    }

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects

    // === WHERE CLAUSES ===
    // WR1 : (Role <> IfcRoleEnum.USERDEFINED) OR ((Role = IfcRoleEnum.USERDEFINED) AND EXISTS(SELF.UserDefinedRole))
}
