public class IfcWindow : IfcBuiltElement
{
    public IfcPositiveLengthMeasure OverallHeight { get; set; }
    public IfcPositiveLengthMeasure OverallWidth { get; set; }
    public IfcWindowTypeEnum PredefinedType { get; set; }
    public IfcWindowTypePartitioningEnum PartitioningType { get; set; }
    public IfcLabel UserDefinedPartitioningType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
