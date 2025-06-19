Public Class IfcSectionReinforcementProperties Inherits IfcPreDefinedProperties
    Public LongitudinalStartPosition As IfcLengthMeasure
    Public LongitudinalEndPosition As IfcLengthMeasure
    Public TransversePosition As IfcLengthMeasure
    Public ReinforcementRole As IfcReinforcingBarRoleEnum
    Public SectionDefinition As IfcSectionProperties
    Public CrossSectionReinforcementDefinitions As SET [1:?] OF IfcReinforcementBarProperties
End Class
