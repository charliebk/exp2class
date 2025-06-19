Public Class IfcObject Inherits IfcObjectDefinition
    Public ObjectType As IfcLabel

    ' === EXTENDED BY ===
    ' IfcActor
    ' IfcControl
    ' IfcGroup
    ' IfcProcess
    ' IfcProduct
    ' IfcResource

    ' === INVERSE CLAUSES ===
    ' IsDeclaredBy : SET [0:1] OF IfcRelDefinesByObject FOR RelatedObjects
    ' Declares : SET [0:?] OF IfcRelDefinesByObject FOR RelatingObject
    ' IsTypedBy : SET [0:1] OF IfcRelDefinesByType FOR RelatedObjects
    ' IsDefinedBy : SET [0:?] OF IfcRelDefinesByProperties FOR RelatedObjects

    ' === WHERE CLAUSES ===
    ' UniquePropertySetNames : ((SIZEOF(IsDefinedBy) = 0) OR IfcUniqueDefinitionNames(IsDefinedBy))
End Class
