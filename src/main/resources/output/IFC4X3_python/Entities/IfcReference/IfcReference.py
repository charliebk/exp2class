from typing import List

class IfcReference:
    def __init__(self):
        self.TypeIdentifier: IfcIdentifier = None
        self.AttributeIdentifier: IfcIdentifier = None
        self.InstanceName: IfcLabel = None
        self.ListPositions: List[IfcInteger] = None
        self.InnerReference: IfcReference = None
