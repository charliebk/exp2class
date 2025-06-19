Public Class IfcFacilityPartCommon Inherits IfcFacilityPart
    Public PredefinedType As IfcFacilityPartCommonTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFacilityPartCommonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFacilityPartCommonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
