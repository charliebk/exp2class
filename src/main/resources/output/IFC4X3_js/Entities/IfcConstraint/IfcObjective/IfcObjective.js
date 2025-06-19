class IfcObjective extends IfcConstraint {
    constructor() {
        /** @type {IFCCONSTRAINT[]} */
        this.BenchmarkValues = null;
        /** @type {IFCLOGICALOPERATORENUM} */
        this.LogicalAggregator = null;
        /** @type {IFCOBJECTIVEENUM} */
        this.ObjectiveQualifier = null;
        /** @type {IFCLABEL} */
        this.UserDefinedQualifier = null;
    }

    // === WHERE CLAUSES ===
    // WR21 : (ObjectiveQualifier <> IfcObjectiveEnum.USERDEFINED) OR ((ObjectiveQualifier = IfcObjectiveEnum.USERDEFINED) AND EXISTS(SELF\IfcObjective.UserDefinedQualifier))
}
