public class IfcCoolingTower : IfcEnergyConversionDevice
{
    public IfcCoolingTowerTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCoolingTowerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoolingTowerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCOOLINGTOWERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
