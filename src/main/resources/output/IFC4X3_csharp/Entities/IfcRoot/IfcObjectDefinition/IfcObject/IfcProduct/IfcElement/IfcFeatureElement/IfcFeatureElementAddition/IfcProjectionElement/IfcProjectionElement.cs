public class IfcProjectionElement : IfcFeatureElementAddition
{
    public IfcProjectionElementTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProjectionElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProjectionElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
