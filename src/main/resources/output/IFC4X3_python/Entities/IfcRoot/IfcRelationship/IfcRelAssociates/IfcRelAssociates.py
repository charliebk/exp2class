class IfcRelAssociates(IfcRelationship):
    def __init__(self):
        self.RelatedObjects: SET [1:?] OF IfcDefinitionSelect = None

    # === EXTENDED BY ===
    # IfcRelAssociatesApproval
    # IfcRelAssociatesClassification
    # IfcRelAssociatesConstraint
    # IfcRelAssociatesDocument
    # IfcRelAssociatesLibrary
    # IfcRelAssociatesMaterial
    # IfcRelAssociatesProfileDef
