Public Class IfcRailway Inherits IfcFacility
    Public PredefinedType As IfcRailwayTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRailwayTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailwayTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
