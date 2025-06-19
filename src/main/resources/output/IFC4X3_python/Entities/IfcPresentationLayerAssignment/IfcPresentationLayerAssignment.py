class IfcPresentationLayerAssignment:
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.AssignedItems: SET [1:?] OF IfcLayeredItem = None
        self.Identifier: IfcIdentifier = None

    # === EXTENDED BY ===
    # IfcPresentationLayerWithStyle

    # === WHERE CLAUSES ===
    # ApplicableItems : SIZEOF(QUERY(temp <* AssignedItems | ( SIZEOF(TYPEOF(temp) * [ 'IFC4X3_DEV_73740fe4.IFCSHAPEREPRESENTATION', 'IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONITEM', 'IFC4X3_DEV_73740fe4.IFCMAPPEDITEM']) = 1) )) = SIZEOF(AssignedItems)
