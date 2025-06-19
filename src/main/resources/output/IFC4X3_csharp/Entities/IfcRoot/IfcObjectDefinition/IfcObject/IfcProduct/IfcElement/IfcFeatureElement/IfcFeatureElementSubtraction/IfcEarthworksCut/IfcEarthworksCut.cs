public class IfcEarthworksCut : IfcFeatureElementSubtraction
{
    public IfcEarthworksCutTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEarthworksCutTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEarthworksCutTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
