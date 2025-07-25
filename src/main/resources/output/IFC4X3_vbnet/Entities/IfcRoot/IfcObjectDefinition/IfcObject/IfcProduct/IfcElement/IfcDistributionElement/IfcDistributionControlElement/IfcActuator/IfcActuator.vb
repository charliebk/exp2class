Public Class IfcActuator Inherits IfcDistributionControlElement
    Public PredefinedType As IfcActuatorTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcActuatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcActuatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCACTUATORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
