public class IfcEarthworksCut extends IfcFeatureElementSubtraction {
    public IfcEarthworksCutTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEarthworksCutTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEarthworksCutTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
