Public Class IfcRoadPart Inherits IfcFacilityPart
    Public PredefinedType As IfcRoadPartTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRoadPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoadPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
