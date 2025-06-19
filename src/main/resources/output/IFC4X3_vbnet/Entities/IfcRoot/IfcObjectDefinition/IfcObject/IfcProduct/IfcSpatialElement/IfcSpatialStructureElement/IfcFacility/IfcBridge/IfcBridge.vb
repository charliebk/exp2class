Public Class IfcBridge Inherits IfcFacility
    Public PredefinedType As IfcBridgeTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBridgeTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBridgeTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
