public class IfcPresentationLayerWithStyle : IfcPresentationLayerAssignment
{
    public IfcLogical LayerOn { get; set; }
    public IfcLogical LayerFrozen { get; set; }
    public IfcLogical LayerBlocked { get; set; }
    public SET [0:?] OF IfcPresentationStyle LayerStyles { get; set; }

    // === WHERE CLAUSES ===
    // ApplicableOnlyToItems : SIZEOF(QUERY(temp <* AssignedItems | (SIZEOF(TYPEOF(temp) * ['IFC4X3_DEV_73740fe4.IfcGeometricRepresentationItem','IFC4X3_DEV_73740fe4.IfcMappedItem']) >= 1))) = SIZEOF(AssignedItems)
}
