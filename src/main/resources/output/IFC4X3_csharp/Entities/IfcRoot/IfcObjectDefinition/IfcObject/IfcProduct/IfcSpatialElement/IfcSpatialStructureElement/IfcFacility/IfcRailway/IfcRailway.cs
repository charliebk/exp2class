public class IfcRailway : IfcFacility
{
    public IfcRailwayTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRailwayTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailwayTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
