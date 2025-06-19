Public Class IfcBridgePart Inherits IfcFacilityPart
    Public PredefinedType As IfcBridgePartTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBridgePartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBridgePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
