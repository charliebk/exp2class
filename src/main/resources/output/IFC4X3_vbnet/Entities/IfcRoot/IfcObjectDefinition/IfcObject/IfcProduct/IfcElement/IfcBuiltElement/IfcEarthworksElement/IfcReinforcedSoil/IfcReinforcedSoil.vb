Public Class IfcReinforcedSoil Inherits IfcEarthworksElement
    Public PredefinedType As IfcReinforcedSoilTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcedSoilTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcedSoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
