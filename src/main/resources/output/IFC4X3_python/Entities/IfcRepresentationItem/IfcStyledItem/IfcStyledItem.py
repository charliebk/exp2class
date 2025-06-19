class IfcStyledItem(IfcRepresentationItem):
    def __init__(self):
        self.Item: IfcRepresentationItem = None
        self.Styles: SET [1:?] OF IfcPresentationStyle = None
        self.Name: IfcLabel = None

    # === WHERE CLAUSES ===
    # ApplicableItem : NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDITEM' IN TYPEOF(Item))
