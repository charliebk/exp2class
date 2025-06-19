Public Class IfcStructuralCurveReaction Inherits IfcStructuralReaction
    Public PredefinedType As IfcStructuralCurveActivityTypeEnum

    ' === WHERE CLAUSES ===
    ' HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    ' SuitablePredefinedType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.SINUS) AND (PredefinedType <> IfcStructuralCurveActivityTypeEnum.PARABOLA)
End Class
