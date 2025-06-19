Public Class IfcStructuralResultGroup Inherits IfcGroup
    Public TheoryType As IfcAnalysisTheoryTypeEnum
    Public ResultForLoadGroup As IfcStructuralLoadGroup
    Public IsLinear As IfcBoolean

    ' === INVERSE CLAUSES ===
    ' ResultGroupFor : SET [0:1] OF IfcStructuralAnalysisModel FOR HasResults

    ' === WHERE CLAUSES ===
    ' HasObjectType : (TheoryType <> IfcAnalysisTheoryTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
End Class
