public class IfcEarthworksFill : IfcEarthworksElement
{
    public IfcEarthworksFillTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEarthworksFillTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEarthworksFillTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
