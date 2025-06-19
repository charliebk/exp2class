from typing import List

class IfcStructuralLoadCase(IfcStructuralLoadGroup):
    def __init__(self):
        self.SelfWeightCoefficients: List[IfcRatioMeasure] = None

    # === WHERE CLAUSES ===
    # IsLoadCasePredefinedType : SELF\IfcStructuralLoadGroup.PredefinedType = IfcLoadGroupTypeEnum.LOAD_CASE
