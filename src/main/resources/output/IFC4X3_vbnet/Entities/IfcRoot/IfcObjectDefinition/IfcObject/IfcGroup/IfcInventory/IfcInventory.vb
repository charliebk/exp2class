Public Class IfcInventory Inherits IfcGroup
    Public PredefinedType As IfcInventoryTypeEnum
    Public Jurisdiction As IfcActorSelect
    Public ResponsiblePersons As SET [1:?] OF IfcPerson
    Public LastUpdateDate As IfcDate
    Public CurrentValue As IfcCostValue
    Public OriginalValue As IfcCostValue
End Class
