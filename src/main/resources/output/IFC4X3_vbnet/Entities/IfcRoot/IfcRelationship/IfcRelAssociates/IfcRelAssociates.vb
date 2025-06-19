Public Class IfcRelAssociates Inherits IfcRelationship
    Public RelatedObjects As SET [1:?] OF IfcDefinitionSelect

    ' === EXTENDED BY ===
    ' IfcRelAssociatesApproval
    ' IfcRelAssociatesClassification
    ' IfcRelAssociatesConstraint
    ' IfcRelAssociatesDocument
    ' IfcRelAssociatesLibrary
    ' IfcRelAssociatesMaterial
    ' IfcRelAssociatesProfileDef
End Class
