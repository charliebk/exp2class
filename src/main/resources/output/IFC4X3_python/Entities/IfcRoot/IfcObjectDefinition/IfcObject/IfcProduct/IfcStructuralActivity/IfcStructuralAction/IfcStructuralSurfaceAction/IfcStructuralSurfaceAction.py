class IfcStructuralSurfaceAction(IfcStructuralAction):
    def __init__(self):
        self.ProjectedOrTrue: IfcProjectedOrTrueLengthEnum = None
        self.PredefinedType: IfcStructuralSurfaceActivityTypeEnum = None

    # === EXTENDED BY ===
    # IfcStructuralPlanarAction

    # === WHERE CLAUSES ===
    # HasObjectType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    # ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR ((ProjectedOrTrue <> PROJECTED_LENGTH) OR (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS))
