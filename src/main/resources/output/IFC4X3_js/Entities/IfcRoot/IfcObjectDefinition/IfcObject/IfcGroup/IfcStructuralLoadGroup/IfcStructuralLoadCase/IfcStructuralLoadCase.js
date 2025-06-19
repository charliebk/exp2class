class IfcStructuralLoadCase extends IfcStructuralLoadGroup {
    constructor() {
        /** @type {IFCRATIOMEASURE[]} */
        this.SelfWeightCoefficients = null;
    }

    // === WHERE CLAUSES ===
    // IsLoadCasePredefinedType : SELF\IfcStructuralLoadGroup.PredefinedType = IfcLoadGroupTypeEnum.LOAD_CASE
}
