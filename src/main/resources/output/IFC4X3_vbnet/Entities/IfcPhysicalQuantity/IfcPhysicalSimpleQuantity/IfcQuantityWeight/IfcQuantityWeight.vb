Public Class IfcQuantityWeight Inherits IfcPhysicalSimpleQuantity
    Public WeightValue As IfcMassMeasure
    Public Formula As IfcLabel

    ' === WHERE CLAUSES ===
    ' WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.MASSUNIT)
    ' WR22 : WeightValue >= 0.
End Class
