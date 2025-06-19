Public Class IfcShadingDevice Inherits IfcBuiltElement
    Public PredefinedType As IfcShadingDeviceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcShadingDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcShadingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSHADINGDEVICETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
