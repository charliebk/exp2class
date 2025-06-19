Public Class IfcVibrationIsolatorType Inherits IfcElementComponentType
    Public PredefinedType As IfcVibrationIsolatorTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcVibrationIsolatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVibrationIsolatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
