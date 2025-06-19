Public Class IfcExtendedProperties Inherits IfcPropertyAbstraction
    Public Name As IfcIdentifier
    Public Description As IfcText
    Public Properties As SET [1:?] OF IfcProperty

    ' === EXTENDED BY ===
    ' IfcMaterialProperties
    ' IfcProfileProperties
End Class
