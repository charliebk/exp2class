Public Class IfcDerivedUnit
    Public Elements As SET [1:?] OF IfcDerivedUnitElement
    Public UnitType As IfcDerivedUnitEnum
    Public UserDefinedType As IfcLabel
    Public Name As IfcLabel

    ' === WHERE CLAUSES ===
    ' WR1 : (SIZEOF (Elements) > 1) OR ((SIZEOF (Elements) = 1) AND (Elements[1].Exponent <> 1 ))
    ' WR2 : (UnitType <> IfcDerivedUnitEnum.USERDEFINED) OR ((UnitType = IfcDerivedUnitEnum.USERDEFINED) AND (EXISTS(SELF.UserDefinedType)))

    ' === DERIVE CLAUSES ===
    ' Dimensions : IfcDimensionalExponents := IfcDeriveDimensionalExponents(Elements)
End Class
