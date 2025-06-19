public class IfcWindow extends IfcBuiltElement {
    public IfcPositiveLengthMeasure OverallHeight;
    public IfcPositiveLengthMeasure OverallWidth;
    public IfcWindowTypeEnum PredefinedType;
    public IfcWindowTypePartitioningEnum PartitioningType;
    public IfcLabel UserDefinedPartitioningType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
