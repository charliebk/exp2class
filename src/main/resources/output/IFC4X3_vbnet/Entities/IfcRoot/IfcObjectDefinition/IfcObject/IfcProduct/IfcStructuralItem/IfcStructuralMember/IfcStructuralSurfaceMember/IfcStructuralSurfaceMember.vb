Public Class IfcStructuralSurfaceMember Inherits IfcStructuralMember
    Public PredefinedType As IfcStructuralSurfaceMemberTypeEnum
    Public Thickness As IfcPositiveLengthMeasure

    ' === EXTENDED BY ===
    ' IfcStructuralSurfaceMemberVarying

    ' === WHERE CLAUSES ===
    ' HasObjectType : (PredefinedType <> IfcStructuralSurfaceMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
End Class
