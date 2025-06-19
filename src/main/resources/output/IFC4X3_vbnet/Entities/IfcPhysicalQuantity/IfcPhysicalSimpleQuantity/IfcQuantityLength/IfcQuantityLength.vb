Public Class IfcQuantityLength Inherits IfcPhysicalSimpleQuantity
    Public LengthValue As IfcLengthMeasure
    Public Formula As IfcLabel

    ' === WHERE CLAUSES ===
    ' WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.LENGTHUNIT)
    ' WR22 : LengthValue >= 0.
End Class
