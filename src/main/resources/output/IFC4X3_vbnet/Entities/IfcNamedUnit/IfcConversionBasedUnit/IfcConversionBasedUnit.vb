Public Class IfcConversionBasedUnit Inherits IfcNamedUnit
    Public Name As IfcLabel
    Public ConversionFactor As IfcMeasureWithUnit

    ' === EXTENDED BY ===
    ' IfcConversionBasedUnitWithOffset

    ' === INVERSE CLAUSES ===
    ' HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
End Class
