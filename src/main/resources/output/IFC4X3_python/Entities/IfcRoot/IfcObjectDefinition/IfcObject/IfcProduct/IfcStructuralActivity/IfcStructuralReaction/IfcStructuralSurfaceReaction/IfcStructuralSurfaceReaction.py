class IfcStructuralSurfaceReaction(IfcStructuralReaction):
    def __init__(self):
        self.PredefinedType: IfcStructuralSurfaceActivityTypeEnum = None

    # === WHERE CLAUSES ===
    # HasPredefinedType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
