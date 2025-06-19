public class IfcDoor extends IfcBuiltElement {
    public IfcPositiveLengthMeasure OverallHeight;
    public IfcPositiveLengthMeasure OverallWidth;
    public IfcDoorTypeEnum PredefinedType;
    public IfcDoorTypeOperationEnum OperationType;
    public IfcLabel UserDefinedOperationType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
