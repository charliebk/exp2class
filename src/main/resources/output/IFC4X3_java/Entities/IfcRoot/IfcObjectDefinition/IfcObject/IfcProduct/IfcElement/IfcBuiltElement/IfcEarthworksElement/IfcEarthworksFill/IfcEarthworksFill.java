public class IfcEarthworksFill extends IfcEarthworksElement {
    public IfcEarthworksFillTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEarthworksFillTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEarthworksFillTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
