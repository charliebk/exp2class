Public Class IfcAppliedValue
    Public Name As IfcLabel
    Public Description As IfcText
    Public AppliedValue As IfcAppliedValueSelect
    Public UnitBasis As IfcMeasureWithUnit
    Public ApplicableDate As IfcDate
    Public FixedUntilDate As IfcDate
    Public Category As IfcLabel
    Public Condition As IfcLabel
    Public ArithmeticOperator As IfcArithmeticOperatorEnum
    Public Components As List(Of IfcAppliedValue)

    ' === EXTENDED BY ===
    ' IfcCostValue

    ' === INVERSE CLAUSES ===
    ' HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
End Class
