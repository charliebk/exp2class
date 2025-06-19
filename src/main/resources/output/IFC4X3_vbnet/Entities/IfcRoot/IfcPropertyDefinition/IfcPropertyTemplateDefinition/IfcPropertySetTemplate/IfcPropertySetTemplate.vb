Public Class IfcPropertySetTemplate Inherits IfcPropertyTemplateDefinition
    Public TemplateType As IfcPropertySetTemplateTypeEnum
    Public ApplicableEntity As IfcIdentifier
    Public HasPropertyTemplates As SET [1:?] OF IfcPropertyTemplate

    ' === INVERSE CLAUSES ===
    ' Defines : SET [0:?] OF IfcRelDefinesByTemplate FOR RelatingTemplate

    ' === WHERE CLAUSES ===
    ' ExistsName : EXISTS(SELF\IfcRoot.Name)
    ' UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates)
End Class
