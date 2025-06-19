Public Class IfcMaterialClassificationRelationship
    Public MaterialClassifications As SET [1:?] OF IfcClassificationSelect
    Public ClassifiedMaterial As IfcMaterial
End Class
