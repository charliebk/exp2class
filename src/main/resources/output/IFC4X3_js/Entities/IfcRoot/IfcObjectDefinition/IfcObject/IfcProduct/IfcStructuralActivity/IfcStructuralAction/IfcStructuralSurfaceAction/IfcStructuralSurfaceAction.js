class IfcStructuralSurfaceAction extends IfcStructuralAction {
    constructor() {
        /** @type {IFCPROJECTEDORTRUELENGTHENUM} */
        this.ProjectedOrTrue = null;
        /** @type {IFCSTRUCTURALSURFACEACTIVITYTYPEENUM} */
        this.PredefinedType = null;
    }

    // === EXTENDED BY ===
    // IfcStructuralPlanarAction

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    // ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR ((ProjectedOrTrue <> PROJECTED_LENGTH) OR (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS))
}
