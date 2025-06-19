public class IfcHumidifier extends IfcEnergyConversionDevice {
    public IfcHumidifierTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcHumidifierTypeEnum.USERDEFINED) OR ((PredefinedType = IfcHumidifierTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCHUMIDIFIERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
