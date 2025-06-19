Public Class IfcRoad Inherits IfcFacility
    Public PredefinedType As IfcRoadTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRoadTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoadTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
