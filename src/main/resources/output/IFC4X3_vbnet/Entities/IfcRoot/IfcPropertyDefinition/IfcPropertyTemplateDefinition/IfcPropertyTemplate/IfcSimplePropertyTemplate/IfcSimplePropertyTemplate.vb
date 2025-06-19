Public Class IfcSimplePropertyTemplate Inherits IfcPropertyTemplate
    Public TemplateType As IfcSimplePropertyTemplateTypeEnum
    Public PrimaryMeasureType As IfcLabel
    Public SecondaryMeasureType As IfcLabel
    Public Enumerators As IfcPropertyEnumeration
    Public PrimaryUnit As IfcUnit
    Public SecondaryUnit As IfcUnit
    Public Expression As IfcLabel
    Public AccessState As IfcStateEnum
End Class
