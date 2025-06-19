class IfcRelAssigns(IfcRelationship):
    def __init__(self):
        self.RelatedObjects: SET [1:?] OF IfcObjectDefinition = None
        self.RelatedObjectsType: IfcStrippedOptional = None

    # === EXTENDED BY ===
    # IfcRelAssignsToActor
    # IfcRelAssignsToControl
    # IfcRelAssignsToGroup
    # IfcRelAssignsToProcess
    # IfcRelAssignsToProduct
    # IfcRelAssignsToResource
