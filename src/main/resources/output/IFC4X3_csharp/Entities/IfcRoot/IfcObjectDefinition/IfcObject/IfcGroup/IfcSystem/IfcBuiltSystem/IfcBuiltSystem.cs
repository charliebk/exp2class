public class IfcBuiltSystem : IfcSystem
{
    public IfcBuiltSystemTypeEnum PredefinedType { get; set; }
    public IfcLabel LongName { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuiltSystemTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuiltSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
