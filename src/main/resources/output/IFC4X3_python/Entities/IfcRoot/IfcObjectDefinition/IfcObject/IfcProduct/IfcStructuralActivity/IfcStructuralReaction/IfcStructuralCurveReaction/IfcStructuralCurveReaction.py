class IfcStructuralCurveReaction(IfcStructuralReaction):
    def __init__(self):
        self.PredefinedType: IfcStructuralCurveActivityTypeEnum = None

    # === WHERE CLAUSES ===
    # HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    # SuitablePredefinedType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.SINUS) AND (PredefinedType <> IfcStructuralCurveActivityTypeEnum.PARABOLA)
