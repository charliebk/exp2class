class IfcAsset(IfcGroup):
    def __init__(self):
        self.Identification: IfcIdentifier = None
        self.OriginalValue: IfcCostValue = None
        self.CurrentValue: IfcCostValue = None
        self.TotalReplacementCost: IfcCostValue = None
        self.Owner: IfcActorSelect = None
        self.User: IfcActorSelect = None
        self.ResponsiblePerson: IfcPerson = None
        self.IncorporationDate: IfcDate = None
        self.DepreciatedValue: IfcCostValue = None
