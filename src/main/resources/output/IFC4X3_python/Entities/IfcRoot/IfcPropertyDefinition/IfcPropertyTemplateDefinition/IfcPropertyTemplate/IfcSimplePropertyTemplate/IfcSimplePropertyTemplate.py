class IfcSimplePropertyTemplate(IfcPropertyTemplate):
    def __init__(self):
        self.TemplateType: IfcSimplePropertyTemplateTypeEnum = None
        self.PrimaryMeasureType: IfcLabel = None
        self.SecondaryMeasureType: IfcLabel = None
        self.Enumerators: IfcPropertyEnumeration = None
        self.PrimaryUnit: IfcUnit = None
        self.SecondaryUnit: IfcUnit = None
        self.Expression: IfcLabel = None
        self.AccessState: IfcStateEnum = None
