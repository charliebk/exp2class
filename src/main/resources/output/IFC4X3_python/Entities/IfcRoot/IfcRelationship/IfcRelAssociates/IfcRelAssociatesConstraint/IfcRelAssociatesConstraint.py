class IfcRelAssociatesConstraint(IfcRelAssociates):
    def __init__(self):
        self.Intent: IfcLabel = None
        self.RelatingConstraint: IfcConstraint = None
