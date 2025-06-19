public class IfcRoadPart : IfcFacilityPart
{
    public IfcRoadPartTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRoadPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoadPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
