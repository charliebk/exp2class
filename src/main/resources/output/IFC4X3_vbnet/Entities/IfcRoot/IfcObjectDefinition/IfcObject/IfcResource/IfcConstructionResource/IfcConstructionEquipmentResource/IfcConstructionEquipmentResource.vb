Public Class IfcConstructionEquipmentResource Inherits IfcConstructionResource
    Public PredefinedType As IfcConstructionEquipmentResourceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
