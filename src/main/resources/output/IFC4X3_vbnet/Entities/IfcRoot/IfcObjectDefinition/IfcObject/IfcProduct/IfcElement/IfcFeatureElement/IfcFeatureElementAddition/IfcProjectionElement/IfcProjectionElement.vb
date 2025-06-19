Public Class IfcProjectionElement Inherits IfcFeatureElementAddition
    Public PredefinedType As IfcProjectionElementTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProjectionElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProjectionElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
