from typing import List

class IfcCostItem(IfcControl):
    def __init__(self):
        self.PredefinedType: IfcCostItemTypeEnum = None
        self.CostValues: List[IfcCostValue] = None
        self.CostQuantities: List[IfcPhysicalQuantity] = None
