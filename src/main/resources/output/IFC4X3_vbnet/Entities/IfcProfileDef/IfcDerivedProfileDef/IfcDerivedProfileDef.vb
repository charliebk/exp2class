Public Class IfcDerivedProfileDef Inherits IfcProfileDef
    Public ParentProfile As IfcProfileDef
    Public Operator As IfcCartesianTransformationOperator2D
    Public Label As IfcLabel

    ' === EXTENDED BY ===
    ' IfcMirroredProfileDef

    ' === WHERE CLAUSES ===
    ' InvariantProfileType : SELF\IfcProfileDef.ProfileType = ParentProfile.ProfileType
End Class
