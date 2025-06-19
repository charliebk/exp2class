class IfcConstraint {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCCONSTRAINTENUM} */
        this.ConstraintGrade = null;
        /** @type {IFCLABEL} */
        this.ConstraintSource = null;
        /** @type {IFCACTORSELECT} */
        this.CreatingActor = null;
        /** @type {IFCDATETIME} */
        this.CreationTime = null;
        /** @type {IFCLABEL} */
        this.UserDefinedGrade = null;
    }

    // === EXTENDED BY ===
    // IfcMetric
    // IfcObjective

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // PropertiesForConstraint : SET [0:?] OF IfcResourceConstraintRelationship FOR RelatingConstraint

    // === WHERE CLAUSES ===
    // WR11 : (ConstraintGrade <> IfcConstraintEnum.USERDEFINED) OR ((ConstraintGrade = IfcConstraintEnum.USERDEFINED) AND EXISTS(SELF\IfcConstraint.UserDefinedGrade))
}
