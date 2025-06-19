public class IfcVibrationDamper extends IfcElementComponent {
    public IfcVibrationDamperTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVibrationDamperTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVibrationDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCVIBRATIONDAMPERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
