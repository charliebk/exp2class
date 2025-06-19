Public Class IfcFastenerType Inherits IfcElementComponentType
    Public PredefinedType As IfcFastenerTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcFastenerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
