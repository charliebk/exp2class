public class IfcStairFlight : IfcBuiltElement
{
    public IfcInteger NumberOfRisers { get; set; }
    public IfcInteger NumberOfTreads { get; set; }
    public IfcPositiveLengthMeasure RiserHeight { get; set; }
    public IfcPositiveLengthMeasure TreadLength { get; set; }
    public IfcStairFlightTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSTAIRFLIGHTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
