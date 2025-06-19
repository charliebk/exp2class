public class IfcVehicleType : IfcTransportationDeviceType
{
    public IfcVehicleTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcVehicleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVehicleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
