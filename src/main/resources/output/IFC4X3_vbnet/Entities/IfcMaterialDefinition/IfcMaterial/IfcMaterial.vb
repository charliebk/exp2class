Public Class IfcMaterial Inherits IfcMaterialDefinition
    Public Name As IfcLabel
    Public Description As IfcText
    Public Category As IfcLabel

    ' === INVERSE CLAUSES ===
    ' HasRepresentation : SET [0:1] OF IfcMaterialDefinitionRepresentation FOR RepresentedMaterial
    ' IsRelatedWith : SET [0:?] OF IfcMaterialRelationship FOR RelatedMaterials
    ' RelatesTo : SET [0:1] OF IfcMaterialRelationship FOR RelatingMaterial
End Class
