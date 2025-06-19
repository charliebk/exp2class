Public Class IfcMarineFacility Inherits IfcFacility
    Public PredefinedType As IfcMarineFacilityTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMarineFacilityTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMarineFacilityTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
