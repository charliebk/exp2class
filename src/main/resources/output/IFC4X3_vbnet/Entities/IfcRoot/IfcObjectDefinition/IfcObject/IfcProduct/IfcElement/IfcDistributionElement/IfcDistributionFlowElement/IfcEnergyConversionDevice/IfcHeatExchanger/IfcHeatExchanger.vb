Public Class IfcHeatExchanger Inherits IfcEnergyConversionDevice
    Public PredefinedType As IfcHeatExchangerTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcHeatExchangerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcHeatExchangerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCHEATEXCHANGERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
