Public Class IfcStructuralSurfaceAction Inherits IfcStructuralAction
    Public ProjectedOrTrue As IfcProjectedOrTrueLengthEnum
    Public PredefinedType As IfcStructuralSurfaceActivityTypeEnum

    ' === EXTENDED BY ===
    ' IfcStructuralPlanarAction

    ' === WHERE CLAUSES ===
    ' HasObjectType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    ' ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR ((ProjectedOrTrue <> PROJECTED_LENGTH) OR (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS))
End Class
