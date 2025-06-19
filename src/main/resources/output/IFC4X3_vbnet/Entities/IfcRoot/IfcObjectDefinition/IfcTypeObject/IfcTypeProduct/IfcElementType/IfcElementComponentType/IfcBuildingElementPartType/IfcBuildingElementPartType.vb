Public Class IfcBuildingElementPartType Inherits IfcElementComponentType
    Public PredefinedType As IfcBuildingElementPartTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcBuildingElementPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingElementPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
