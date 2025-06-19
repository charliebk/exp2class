Public Class IfcTypeProduct Inherits IfcTypeObject
    Public RepresentationMaps As List(Of UNIQUE IfcRepresentationMap)
    Public Tag As IfcLabel

    ' === EXTENDED BY ===
    ' IfcElementType
    ' IfcSpatialElementType

    ' === INVERSE CLAUSES ===
    ' ReferencedBy : SET [0:?] OF IfcRelAssignsToProduct FOR RelatingProduct

    ' === WHERE CLAUSES ===
    ' ApplicableOccurrence : NOT(EXISTS(SELF\IfcTypeObject.Types[1])) OR (SIZEOF(QUERY(temp <* SELF\IfcTypeObject.Types[1].RelatedObjects | NOT('IFC4X3_DEV_73740fe4.IFCPRODUCT' IN TYPEOF(temp))) ) = 0)
End Class
