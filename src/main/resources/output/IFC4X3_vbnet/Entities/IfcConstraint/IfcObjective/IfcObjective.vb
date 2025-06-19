Public Class IfcObjective Inherits IfcConstraint
    Public BenchmarkValues As List(Of IfcConstraint)
    Public LogicalAggregator As IfcLogicalOperatorEnum
    Public ObjectiveQualifier As IfcObjectiveEnum
    Public UserDefinedQualifier As IfcLabel

    ' === WHERE CLAUSES ===
    ' WR21 : (ObjectiveQualifier <> IfcObjectiveEnum.USERDEFINED) OR ((ObjectiveQualifier = IfcObjectiveEnum.USERDEFINED) AND EXISTS(SELF\IfcObjective.UserDefinedQualifier))
End Class
