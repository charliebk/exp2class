Public Class IfcMechanicalFastenerType Inherits IfcElementComponentType
    Public PredefinedType As IfcMechanicalFastenerTypeEnum
    Public NominalDiameter As IfcPositiveLengthMeasure
    Public NominalLength As IfcPositiveLengthMeasure

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcMechanicalFastenerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMechanicalFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
