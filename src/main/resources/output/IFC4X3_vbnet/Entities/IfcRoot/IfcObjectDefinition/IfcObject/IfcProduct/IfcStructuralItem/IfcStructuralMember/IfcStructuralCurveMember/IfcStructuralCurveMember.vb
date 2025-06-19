Public Class IfcStructuralCurveMember Inherits IfcStructuralMember
    Public PredefinedType As IfcStructuralCurveMemberTypeEnum
    Public Axis As IfcDirection

    ' === EXTENDED BY ===
    ' IfcStructuralCurveMemberVarying

    ' === WHERE CLAUSES ===
    ' HasObjectType : (PredefinedType <> IfcStructuralCurveMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
End Class
