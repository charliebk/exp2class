Public Class IfcAsset Inherits IfcGroup
    Public Identification As IfcIdentifier
    Public OriginalValue As IfcCostValue
    Public CurrentValue As IfcCostValue
    Public TotalReplacementCost As IfcCostValue
    Public Owner As IfcActorSelect
    Public User As IfcActorSelect
    Public ResponsiblePerson As IfcPerson
    Public IncorporationDate As IfcDate
    Public DepreciatedValue As IfcCostValue
End Class
