class IfcRelConnectsStructuralActivity(IfcRelConnects):
    def __init__(self):
        self.RelatingElement: IfcStructuralActivityAssignmentSelect = None
        self.RelatedStructuralActivity: IfcStructuralActivity = None
