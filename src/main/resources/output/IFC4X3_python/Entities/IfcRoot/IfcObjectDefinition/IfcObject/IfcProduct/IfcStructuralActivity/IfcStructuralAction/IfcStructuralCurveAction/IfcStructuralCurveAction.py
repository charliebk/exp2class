class IfcStructuralCurveAction(IfcStructuralAction):
    def __init__(self):
        self.ProjectedOrTrue: IfcProjectedOrTrueLengthEnum = None
        self.PredefinedType: IfcStructuralCurveActivityTypeEnum = None

    # === EXTENDED BY ===
    # IfcStructuralLinearAction

    # === WHERE CLAUSES ===
    # HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    # ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR ((ProjectedOrTrue <> PROJECTED_LENGTH) OR (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS))
    # SuitablePredefinedType : PredefinedType <> IfcStructuralCurveActivityTypeEnum.EQUIDISTANT
