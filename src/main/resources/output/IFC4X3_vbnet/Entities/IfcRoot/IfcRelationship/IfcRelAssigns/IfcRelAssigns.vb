Public Class IfcRelAssigns Inherits IfcRelationship
    Public RelatedObjects As SET [1:?] OF IfcObjectDefinition
    Public RelatedObjectsType As IfcStrippedOptional

    ' === EXTENDED BY ===
    ' IfcRelAssignsToActor
    ' IfcRelAssignsToControl
    ' IfcRelAssignsToGroup
    ' IfcRelAssignsToProcess
    ' IfcRelAssignsToProduct
    ' IfcRelAssignsToResource
End Class
