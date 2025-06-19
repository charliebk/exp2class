Public Class IfcEarthworksCut Inherits IfcFeatureElementSubtraction
    Public PredefinedType As IfcEarthworksCutTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEarthworksCutTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEarthworksCutTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
