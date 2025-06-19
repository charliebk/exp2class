class IfcStructuralSurfaceReaction extends IfcStructuralReaction {
    constructor() {
        /** @type {IFCSTRUCTURALSURFACEACTIVITYTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // HasPredefinedType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
