Public Class IfcMaterialConstituentSet Inherits IfcMaterialDefinition
    Public Name As IfcLabel
    Public Description As IfcText
    Public MaterialConstituents As SET [1:?] OF IfcMaterialConstituent
End Class
