from typing import List

class IfcAppliedValue:
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.AppliedValue: IfcAppliedValueSelect = None
        self.UnitBasis: IfcMeasureWithUnit = None
        self.ApplicableDate: IfcDate = None
        self.FixedUntilDate: IfcDate = None
        self.Category: IfcLabel = None
        self.Condition: IfcLabel = None
        self.ArithmeticOperator: IfcArithmeticOperatorEnum = None
        self.Components: List[IfcAppliedValue] = None

    # === EXTENDED BY ===
    # IfcCostValue

    # === INVERSE CLAUSES ===
    # HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
