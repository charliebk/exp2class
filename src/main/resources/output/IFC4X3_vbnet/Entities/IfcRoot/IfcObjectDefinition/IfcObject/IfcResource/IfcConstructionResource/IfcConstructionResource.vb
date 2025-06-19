Public Class IfcConstructionResource Inherits IfcResource
    Public Usage As IfcResourceTime
    Public BaseCosts As List(Of IfcAppliedValue)
    Public BaseQuantity As IfcPhysicalQuantity

    ' === EXTENDED BY ===
    ' IfcConstructionEquipmentResource
    ' IfcConstructionMaterialResource
    ' IfcConstructionProductResource
    ' IfcCrewResource
    ' IfcLaborResource
    ' IfcSubContractResource
End Class
