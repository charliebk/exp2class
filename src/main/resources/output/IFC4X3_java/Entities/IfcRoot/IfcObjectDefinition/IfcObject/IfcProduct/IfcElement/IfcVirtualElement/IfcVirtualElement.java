public class IfcVirtualElement extends IfcElement {
    public IfcVirtualElementTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVirtualElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVirtualElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
