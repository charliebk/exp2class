Public Class IfcPresentationLayerWithStyle Inherits IfcPresentationLayerAssignment
    Public LayerOn As IfcLogical
    Public LayerFrozen As IfcLogical
    Public LayerBlocked As IfcLogical
    Public LayerStyles As SET [0:?] OF IfcPresentationStyle

    ' === WHERE CLAUSES ===
    ' ApplicableOnlyToItems : SIZEOF(QUERY(temp <* AssignedItems | (SIZEOF(TYPEOF(temp) * ['IFC4X3_DEV_73740fe4.IfcGeometricRepresentationItem','IFC4X3_DEV_73740fe4.IfcMappedItem']) >= 1))) = SIZEOF(AssignedItems)
End Class
