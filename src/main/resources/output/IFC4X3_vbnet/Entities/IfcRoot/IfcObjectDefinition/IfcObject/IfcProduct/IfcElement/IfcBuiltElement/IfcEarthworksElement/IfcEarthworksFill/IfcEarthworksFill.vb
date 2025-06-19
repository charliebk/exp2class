Public Class IfcEarthworksFill Inherits IfcEarthworksElement
    Public PredefinedType As IfcEarthworksFillTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEarthworksFillTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEarthworksFillTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
