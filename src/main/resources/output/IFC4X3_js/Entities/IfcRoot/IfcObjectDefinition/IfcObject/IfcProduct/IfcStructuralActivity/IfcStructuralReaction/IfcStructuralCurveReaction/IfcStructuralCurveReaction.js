class IfcStructuralCurveReaction extends IfcStructuralReaction {
    constructor() {
        /** @type {IFCSTRUCTURALCURVEACTIVITYTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    // SuitablePredefinedType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.SINUS) AND (PredefinedType <> IfcStructuralCurveActivityTypeEnum.PARABOLA)
}
