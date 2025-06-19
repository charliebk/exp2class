Public Class IfcComplexPropertyTemplate Inherits IfcPropertyTemplate
    Public UsageName As IfcLabel
    Public TemplateType As IfcComplexPropertyTemplateTypeEnum
    Public HasPropertyTemplates As SET [1:?] OF IfcPropertyTemplate

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(temp <* HasPropertyTemplates | SELF :=: temp)) = 0
    ' UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates)
End Class
