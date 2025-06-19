Public Class IfcColumnType Inherits IfcBuiltElementType
    Public PredefinedType As IfcColumnTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcColumnTypeEnum.USERDEFINED) OR ((PredefinedType = IfcColumnTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
