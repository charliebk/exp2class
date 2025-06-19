class IfcInventory(IfcGroup):
    def __init__(self):
        self.PredefinedType: IfcInventoryTypeEnum = None
        self.Jurisdiction: IfcActorSelect = None
        self.ResponsiblePersons: SET [1:?] OF IfcPerson = None
        self.LastUpdateDate: IfcDate = None
        self.CurrentValue: IfcCostValue = None
        self.OriginalValue: IfcCostValue = None
