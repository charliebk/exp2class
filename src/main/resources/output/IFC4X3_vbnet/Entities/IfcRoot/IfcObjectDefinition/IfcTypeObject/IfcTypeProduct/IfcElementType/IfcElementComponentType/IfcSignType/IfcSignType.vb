Public Class IfcSignType Inherits IfcElementComponentType
    Public PredefinedType As IfcSignTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcSignTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSignTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
