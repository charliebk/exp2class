Public Class IfcRailwayPart Inherits IfcFacilityPart
    Public PredefinedType As IfcRailwayPartTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRailwayPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailwayPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
