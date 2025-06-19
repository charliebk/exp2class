Public Class IfcRelDeclares Inherits IfcRelationship
    Public RelatingContext As IfcContext
    Public RelatedDefinitions As SET [1:?] OF IfcDefinitionSelect

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(Temp <* RelatedDefinitions | RelatingContext :=: Temp)) = 0
End Class
