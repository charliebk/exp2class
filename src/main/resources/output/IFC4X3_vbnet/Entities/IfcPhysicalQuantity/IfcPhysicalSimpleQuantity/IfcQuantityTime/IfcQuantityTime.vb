Public Class IfcQuantityTime Inherits IfcPhysicalSimpleQuantity
    Public TimeValue As IfcTimeMeasure
    Public Formula As IfcLabel

    ' === WHERE CLAUSES ===
    ' WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.TIMEUNIT)
    ' WR22 : TimeValue >= 0.
End Class
