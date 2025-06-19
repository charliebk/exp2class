Public Class IfcStructuralCurveAction Inherits IfcStructuralAction
    Public ProjectedOrTrue As IfcProjectedOrTrueLengthEnum
    Public PredefinedType As IfcStructuralCurveActivityTypeEnum

    ' === EXTENDED BY ===
    ' IfcStructuralLinearAction

    ' === WHERE CLAUSES ===
    ' HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    ' ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR ((ProjectedOrTrue <> PROJECTED_LENGTH) OR (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS))
    ' SuitablePredefinedType : PredefinedType <> IfcStructuralCurveActivityTypeEnum.EQUIDISTANT
End Class
