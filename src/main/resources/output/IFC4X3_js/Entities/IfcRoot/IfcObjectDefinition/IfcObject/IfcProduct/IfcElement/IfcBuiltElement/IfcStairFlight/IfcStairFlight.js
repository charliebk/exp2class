class IfcStairFlight extends IfcBuiltElement {
    constructor() {
        /** @type {IFCINTEGER} */
        this.NumberOfRisers = null;
        /** @type {IFCINTEGER} */
        this.NumberOfTreads = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.RiserHeight = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.TreadLength = null;
        /** @type {IFCSTAIRFLIGHTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSTAIRFLIGHTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
