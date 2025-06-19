class IfcStructuralLoadGroup extends IfcGroup {
    constructor() {
        /** @type {IFCLOADGROUPTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCACTIONTYPEENUM} */
        this.ActionType = null;
        /** @type {IFCACTIONSOURCETYPEENUM} */
        this.ActionSource = null;
        /** @type {IFCRATIOMEASURE} */
        this.Coefficient = null;
        /** @type {IFCLABEL} */
        this.Purpose = null;
    }

    // === EXTENDED BY ===
    // IfcStructuralLoadCase

    // === INVERSE CLAUSES ===
    // SourceOfResultGroup : SET [0:1] OF IfcStructuralResultGroup FOR ResultForLoadGroup
    // LoadGroupFor : SET [0:?] OF IfcStructuralAnalysisModel FOR LoadedBy

    // === WHERE CLAUSES ===
    // HasObjectType : ( (PredefinedType <> IfcLoadGroupTypeEnum.USERDEFINED) AND (ActionType <> IfcActionTypeEnum.USERDEFINED) AND (ActionSource <> IfcActionSourceTypeEnum.USERDEFINED) ) OR EXISTS(SELF\IfcObject.ObjectType)
}
