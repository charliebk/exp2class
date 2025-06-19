Public Class IfcTendonType Inherits IfcReinforcingElementType
    Public PredefinedType As IfcTendonTypeEnum
    Public NominalDiameter As IfcPositiveLengthMeasure
    Public CrossSectionArea As IfcAreaMeasure
    Public SheathDiameter As IfcPositiveLengthMeasure

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
