Public Class IfcPropertySet Inherits IfcPropertySetDefinition
    Public HasProperties As SET [1:?] OF IfcProperty

    ' === WHERE CLAUSES ===
    ' ExistsName : EXISTS(SELF\IfcRoot.Name)
    ' UniquePropertyNames : IfcUniquePropertyName(HasProperties)
End Class
