public class IfcConstructionProductResource extends IfcConstructionResource {
    public IfcConstructionProductResourceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcConstructionProductResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionProductResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
