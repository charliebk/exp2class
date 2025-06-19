class IfcResourceConstraintRelationship(IfcResourceLevelRelationship):
    def __init__(self):
        self.RelatingConstraint: IfcConstraint = None
        self.RelatedResourceObjects: SET [1:?] OF IfcResourceObjectSelect = None
