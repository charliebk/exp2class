public class IfcBuildingSystem : IfcSystem
{
    public IfcBuildingSystemTypeEnum PredefinedType { get; set; }
    public IfcLabel LongName { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuildingSystemTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
