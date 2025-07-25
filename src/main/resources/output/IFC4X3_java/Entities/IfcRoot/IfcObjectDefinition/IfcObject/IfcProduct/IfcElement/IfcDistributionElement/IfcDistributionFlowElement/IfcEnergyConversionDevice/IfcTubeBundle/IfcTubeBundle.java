public class IfcTubeBundle extends IfcEnergyConversionDevice {
    public IfcTubeBundleTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTubeBundleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTubeBundleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCTUBEBUNDLETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
