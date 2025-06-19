Public Class IfcDiscreteAccessoryType Inherits IfcElementComponentType
    Public PredefinedType As IfcDiscreteAccessoryTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcDiscreteAccessoryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDiscreteAccessoryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
