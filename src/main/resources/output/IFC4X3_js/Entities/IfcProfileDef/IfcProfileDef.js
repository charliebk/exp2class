class IfcProfileDef {
    constructor() {
        /** @type {IFCPROFILETYPEENUM} */
        this.ProfileType = null;
        /** @type {IFCLABEL} */
        this.ProfileName = null;
    }

    // === EXTENDED BY ===
    // IfcArbitraryClosedProfileDef
    // IfcArbitraryOpenProfileDef
    // IfcCompositeProfileDef
    // IfcDerivedProfileDef
    // IfcOpenCrossProfileDef
    // IfcParameterizedProfileDef

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // HasProperties : SET [0:?] OF IfcProfileProperties FOR ProfileDefinition
}
