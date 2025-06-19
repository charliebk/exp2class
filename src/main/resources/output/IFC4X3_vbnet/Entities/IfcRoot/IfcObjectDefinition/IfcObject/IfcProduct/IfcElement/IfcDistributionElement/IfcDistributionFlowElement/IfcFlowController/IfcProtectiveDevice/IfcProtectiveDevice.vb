Public Class IfcProtectiveDevice Inherits IfcFlowController
    Public PredefinedType As IfcProtectiveDeviceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProtectiveDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProtectiveDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCPROTECTIVEDEVICETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
