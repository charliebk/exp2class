Public Class IfcStructuralActivity Inherits IfcProduct
    Public AppliedLoad As IfcStructuralLoad
    Public GlobalOrLocal As IfcGlobalOrLocalEnum

    ' === EXTENDED BY ===
    ' IfcStructuralAction
    ' IfcStructuralReaction

    ' === INVERSE CLAUSES ===
    ' AssignedToStructuralItem : SET [0:1] OF IfcRelConnectsStructuralActivity FOR RelatedStructuralActivity
End Class
