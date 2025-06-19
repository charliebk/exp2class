Public Class IfcStructuralConnection Inherits IfcStructuralItem
    Public AppliedCondition As IfcBoundaryCondition

    ' === EXTENDED BY ===
    ' IfcStructuralCurveConnection
    ' IfcStructuralPointConnection
    ' IfcStructuralSurfaceConnection

    ' === INVERSE CLAUSES ===
    ' ConnectsStructuralMembers : SET [1:?] OF IfcRelConnectsStructuralMember FOR RelatedStructuralConnection
End Class
