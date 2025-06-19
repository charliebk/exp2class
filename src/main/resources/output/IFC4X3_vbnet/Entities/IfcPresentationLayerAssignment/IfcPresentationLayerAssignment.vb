Public Class IfcPresentationLayerAssignment
    Public Name As IfcLabel
    Public Description As IfcText
    Public AssignedItems As SET [1:?] OF IfcLayeredItem
    Public Identifier As IfcIdentifier

    ' === EXTENDED BY ===
    ' IfcPresentationLayerWithStyle

    ' === WHERE CLAUSES ===
    ' ApplicableItems : SIZEOF(QUERY(temp <* AssignedItems | ( SIZEOF(TYPEOF(temp) * [ 'IFC4X3_DEV_73740fe4.IFCSHAPEREPRESENTATION', 'IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONITEM', 'IFC4X3_DEV_73740fe4.IFCMAPPEDITEM']) = 1) )) = SIZEOF(AssignedItems)
End Class
