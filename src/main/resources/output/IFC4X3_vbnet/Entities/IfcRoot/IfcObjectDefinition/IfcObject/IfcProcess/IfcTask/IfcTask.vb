Public Class IfcTask Inherits IfcProcess
    Public Status As IfcLabel
    Public WorkMethod As IfcLabel
    Public IsMilestone As IfcBoolean
    Public Priority As IfcInteger
    Public TaskTime As IfcTaskTime
    Public PredefinedType As IfcTaskTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    ' HasName : EXISTS(SELF\IfcRoot.Name)
End Class
