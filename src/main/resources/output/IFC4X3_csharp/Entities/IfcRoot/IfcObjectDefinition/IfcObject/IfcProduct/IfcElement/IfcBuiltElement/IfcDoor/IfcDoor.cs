public class IfcDoor : IfcBuiltElement
{
    public IfcPositiveLengthMeasure OverallHeight { get; set; }
    public IfcPositiveLengthMeasure OverallWidth { get; set; }
    public IfcDoorTypeEnum PredefinedType { get; set; }
    public IfcDoorTypeOperationEnum OperationType { get; set; }
    public IfcLabel UserDefinedOperationType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
