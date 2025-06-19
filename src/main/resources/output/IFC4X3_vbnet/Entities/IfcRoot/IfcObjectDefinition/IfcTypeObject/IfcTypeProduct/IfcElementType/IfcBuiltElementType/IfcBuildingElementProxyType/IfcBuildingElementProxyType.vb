Public Class IfcBuildingElementProxyType Inherits IfcBuiltElementType
    Public PredefinedType As IfcBuildingElementProxyTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcBuildingElementProxyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingElementProxyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
