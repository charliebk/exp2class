public class IfcMarinePart : IfcFacilityPart
{
    public IfcMarinePartTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMarinePartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMarinePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
