from typing import List

class IfcConstructionResource(IfcResource):
    def __init__(self):
        self.Usage: IfcResourceTime = None
        self.BaseCosts: List[IfcAppliedValue] = None
        self.BaseQuantity: IfcPhysicalQuantity = None

    # === EXTENDED BY ===
    # IfcConstructionEquipmentResource
    # IfcConstructionMaterialResource
    # IfcConstructionProductResource
    # IfcCrewResource
    # IfcLaborResource
    # IfcSubContractResource
