class IfcRelDefinesByTemplate(IfcRelDefines):
    def __init__(self):
        self.RelatedPropertySets: SET [1:?] OF IfcPropertySetDefinition = None
        self.RelatingTemplate: IfcPropertySetTemplate = None
