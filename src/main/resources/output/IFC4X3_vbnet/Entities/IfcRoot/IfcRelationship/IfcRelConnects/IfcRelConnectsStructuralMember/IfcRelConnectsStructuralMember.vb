Public Class IfcRelConnectsStructuralMember Inherits IfcRelConnects
    Public RelatingStructuralMember As IfcStructuralMember
    Public RelatedStructuralConnection As IfcStructuralConnection
    Public AppliedCondition As IfcBoundaryCondition
    Public AdditionalConditions As IfcStructuralConnectionCondition
    Public SupportedLength As IfcLengthMeasure
    Public ConditionCoordinateSystem As IfcAxis2Placement3D

    ' === EXTENDED BY ===
    ' IfcRelConnectsWithEccentricity
End Class
