public class IfcBuildingSystem extends IfcSystem {
    public IfcBuildingSystemTypeEnum PredefinedType;
    public IfcLabel LongName;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuildingSystemTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
