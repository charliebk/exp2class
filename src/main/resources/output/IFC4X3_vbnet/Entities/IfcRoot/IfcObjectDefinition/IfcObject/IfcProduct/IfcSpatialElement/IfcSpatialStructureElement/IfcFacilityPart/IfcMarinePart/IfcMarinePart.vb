Public Class IfcMarinePart Inherits IfcFacilityPart
    Public PredefinedType As IfcMarinePartTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMarinePartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMarinePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
