class IfcPresentationLayerWithStyle(IfcPresentationLayerAssignment):
    def __init__(self):
        self.LayerOn: IfcLogical = None
        self.LayerFrozen: IfcLogical = None
        self.LayerBlocked: IfcLogical = None
        self.LayerStyles: SET [0:?] OF IfcPresentationStyle = None

    # === WHERE CLAUSES ===
    # ApplicableOnlyToItems : SIZEOF(QUERY(temp <* AssignedItems | (SIZEOF(TYPEOF(temp) * ['IFC4X3_DEV_73740fe4.IfcGeometricRepresentationItem','IFC4X3_DEV_73740fe4.IfcMappedItem']) >= 1))) = SIZEOF(AssignedItems)
