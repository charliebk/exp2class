public class IfcBuiltSystem extends IfcSystem {
    public IfcBuiltSystemTypeEnum PredefinedType;
    public IfcLabel LongName;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuiltSystemTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuiltSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
