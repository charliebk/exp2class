class IfcVehicle(IfcTransportationDevice):
    def __init__(self):
        self.PredefinedType: IfcVehicleTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVehicleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVehicleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCVEHICLETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
