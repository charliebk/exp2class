public class IfcStairFlight extends IfcBuiltElement {
    public IfcInteger NumberOfRisers;
    public IfcInteger NumberOfTreads;
    public IfcPositiveLengthMeasure RiserHeight;
    public IfcPositiveLengthMeasure TreadLength;
    public IfcStairFlightTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSTAIRFLIGHTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
