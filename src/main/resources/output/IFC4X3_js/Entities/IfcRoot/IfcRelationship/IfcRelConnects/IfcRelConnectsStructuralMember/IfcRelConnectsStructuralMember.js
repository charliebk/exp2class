class IfcRelConnectsStructuralMember extends IfcRelConnects {
    constructor() {
        /** @type {IFCSTRUCTURALMEMBER} */
        this.RelatingStructuralMember = null;
        /** @type {IFCSTRUCTURALCONNECTION} */
        this.RelatedStructuralConnection = null;
        /** @type {IFCBOUNDARYCONDITION} */
        this.AppliedCondition = null;
        /** @type {IFCSTRUCTURALCONNECTIONCONDITION} */
        this.AdditionalConditions = null;
        /** @type {IFCLENGTHMEASURE} */
        this.SupportedLength = null;
        /** @type {IFCAXIS2PLACEMENT3D} */
        this.ConditionCoordinateSystem = null;
    }

    // === EXTENDED BY ===
    // IfcRelConnectsWithEccentricity
}
