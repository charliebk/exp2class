Public Class IfcGeotechnicalStratum Inherits IfcGeotechnicalElement
    Public PredefinedType As IfcGeotechnicalStratumTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcGeotechnicalStratumTypeEnum.USERDEFINED) OR ((PredefinedType = IfcGeotechnicalStratumTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
