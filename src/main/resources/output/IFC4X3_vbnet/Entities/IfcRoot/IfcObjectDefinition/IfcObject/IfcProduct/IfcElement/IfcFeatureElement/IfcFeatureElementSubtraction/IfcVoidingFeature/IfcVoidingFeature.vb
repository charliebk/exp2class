Public Class IfcVoidingFeature Inherits IfcFeatureElementSubtraction
    Public PredefinedType As IfcVoidingFeatureTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVoidingFeatureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVoidingFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
