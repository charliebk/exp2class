Public Class IfcVibrationDamperType Inherits IfcElementComponentType
    Public PredefinedType As IfcVibrationDamperTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcVibrationDamperTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVibrationDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
