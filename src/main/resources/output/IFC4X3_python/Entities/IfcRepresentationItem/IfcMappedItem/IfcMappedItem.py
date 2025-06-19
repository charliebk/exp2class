class IfcMappedItem(IfcRepresentationItem):
    def __init__(self):
        self.MappingSource: IfcRepresentationMap = None
        self.MappingTarget: IfcCartesianTransformationOperator = None
