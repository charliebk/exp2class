class IfcStructuralResultGroup extends IfcGroup {
    constructor() {
        /** @type {IFCANALYSISTHEORYTYPEENUM} */
        this.TheoryType = null;
        /** @type {IFCSTRUCTURALLOADGROUP} */
        this.ResultForLoadGroup = null;
        /** @type {IFCBOOLEAN} */
        this.IsLinear = null;
    }

    // === INVERSE CLAUSES ===
    // ResultGroupFor : SET [0:1] OF IfcStructuralAnalysisModel FOR HasResults

    // === WHERE CLAUSES ===
    // HasObjectType : (TheoryType <> IfcAnalysisTheoryTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
