class IfcCurrencyRelationship(IfcResourceLevelRelationship):
    def __init__(self):
        self.RelatingMonetaryUnit: IfcMonetaryUnit = None
        self.RelatedMonetaryUnit: IfcMonetaryUnit = None
        self.ExchangeRate: IfcPositiveRatioMeasure = None
        self.RateDateTime: IfcDateTime = None
        self.RateSource: IfcLibraryInformation = None
