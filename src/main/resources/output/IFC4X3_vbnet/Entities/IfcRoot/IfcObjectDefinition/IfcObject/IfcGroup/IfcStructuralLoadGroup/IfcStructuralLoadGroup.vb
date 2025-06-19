Public Class IfcStructuralLoadGroup Inherits IfcGroup
    Public PredefinedType As IfcLoadGroupTypeEnum
    Public ActionType As IfcActionTypeEnum
    Public ActionSource As IfcActionSourceTypeEnum
    Public Coefficient As IfcRatioMeasure
    Public Purpose As IfcLabel

    ' === EXTENDED BY ===
    ' IfcStructuralLoadCase

    ' === INVERSE CLAUSES ===
    ' SourceOfResultGroup : SET [0:1] OF IfcStructuralResultGroup FOR ResultForLoadGroup
    ' LoadGroupFor : SET [0:?] OF IfcStructuralAnalysisModel FOR LoadedBy

    ' === WHERE CLAUSES ===
    ' HasObjectType : ( (PredefinedType <> IfcLoadGroupTypeEnum.USERDEFINED) AND (ActionType <> IfcActionTypeEnum.USERDEFINED) AND (ActionSource <> IfcActionSourceTypeEnum.USERDEFINED) ) OR EXISTS(SELF\IfcObject.ObjectType)
End Class
