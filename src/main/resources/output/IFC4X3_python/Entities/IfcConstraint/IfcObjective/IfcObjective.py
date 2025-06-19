from typing import List

class IfcObjective(IfcConstraint):
    def __init__(self):
        self.BenchmarkValues: List[IfcConstraint] = None
        self.LogicalAggregator: IfcLogicalOperatorEnum = None
        self.ObjectiveQualifier: IfcObjectiveEnum = None
        self.UserDefinedQualifier: IfcLabel = None

    # === WHERE CLAUSES ===
    # WR21 : (ObjectiveQualifier <> IfcObjectiveEnum.USERDEFINED) OR ((ObjectiveQualifier = IfcObjectiveEnum.USERDEFINED) AND EXISTS(SELF\IfcObjective.UserDefinedQualifier))
