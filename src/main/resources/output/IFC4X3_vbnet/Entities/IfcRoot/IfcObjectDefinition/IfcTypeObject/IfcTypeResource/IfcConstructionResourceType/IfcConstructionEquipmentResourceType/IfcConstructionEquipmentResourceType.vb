Public Class IfcConstructionEquipmentResourceType Inherits IfcConstructionResourceType
    Public PredefinedType As IfcConstructionEquipmentResourceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
End Class
