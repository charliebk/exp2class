class IfcDistributionSystem extends IfcSystem {
    constructor() {
        /** @type {IFCLABEL} */
        this.LongName = null;
        /** @type {IFCDISTRIBUTIONSYSTEMENUM} */
        this.PredefinedType = null;
    }

    // === EXTENDED BY ===
    // IfcDistributionCircuit

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDistributionSystemEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionSystemEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
