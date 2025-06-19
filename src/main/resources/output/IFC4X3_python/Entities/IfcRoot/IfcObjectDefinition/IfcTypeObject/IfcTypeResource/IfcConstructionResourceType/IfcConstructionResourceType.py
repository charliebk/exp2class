from typing import List

class IfcConstructionResourceType(IfcTypeResource):
    def __init__(self):
        self.BaseCosts: List[IfcAppliedValue] = None
        self.BaseQuantity: IfcPhysicalQuantity = None

    # === EXTENDED BY ===
    # IfcConstructionEquipmentResourceType
    # IfcConstructionMaterialResourceType
    # IfcConstructionProductResourceType
    # IfcCrewResourceType
    # IfcLaborResourceType
    # IfcSubContractResourceType
