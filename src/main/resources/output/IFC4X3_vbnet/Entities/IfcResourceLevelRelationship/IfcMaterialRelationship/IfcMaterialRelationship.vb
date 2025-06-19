Public Class IfcMaterialRelationship Inherits IfcResourceLevelRelationship
    Public RelatingMaterial As IfcMaterial
    Public RelatedMaterials As SET [1:?] OF IfcMaterial
    Public MaterialExpression As IfcLabel
End Class
