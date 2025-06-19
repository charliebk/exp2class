Public Class IfcStructuralSurfaceReaction Inherits IfcStructuralReaction
    Public PredefinedType As IfcStructuralSurfaceActivityTypeEnum

    ' === WHERE CLAUSES ===
    ' HasPredefinedType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
End Class
