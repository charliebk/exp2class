Public Class IfcQuantityArea Inherits IfcPhysicalSimpleQuantity
    Public AreaValue As IfcAreaMeasure
    Public Formula As IfcLabel

    ' === WHERE CLAUSES ===
    ' WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.AREAUNIT)
    ' WR22 : AreaValue >= 0.
End Class
