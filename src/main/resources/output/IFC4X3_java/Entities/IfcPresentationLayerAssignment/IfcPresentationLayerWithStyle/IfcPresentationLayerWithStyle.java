public class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment {
    public IfcLogical LayerOn;
    public IfcLogical LayerFrozen;
    public IfcLogical LayerBlocked;
    public SET [0:?] OF IfcPresentationStyle LayerStyles;

    // === WHERE CLAUSES ===
    // ApplicableOnlyToItems : SIZEOF(QUERY(temp <* AssignedItems | (SIZEOF(TYPEOF(temp) * ['IFC4X3_DEV_73740fe4.IfcGeometricRepresentationItem','IFC4X3_DEV_73740fe4.IfcMappedItem']) >= 1))) = SIZEOF(AssignedItems)
}
