Public Class IfcCostItem Inherits IfcControl
    Public PredefinedType As IfcCostItemTypeEnum
    Public CostValues As List(Of IfcCostValue)
    Public CostQuantities As List(Of IfcPhysicalQuantity)
End Class
