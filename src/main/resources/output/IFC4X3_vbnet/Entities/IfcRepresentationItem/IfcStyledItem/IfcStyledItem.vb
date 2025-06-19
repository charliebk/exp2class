Public Class IfcStyledItem Inherits IfcRepresentationItem
    Public Item As IfcRepresentationItem
    Public Styles As SET [1:?] OF IfcPresentationStyle
    Public Name As IfcLabel

    ' === WHERE CLAUSES ===
    ' ApplicableItem : NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDITEM' IN TYPEOF(Item))
End Class
