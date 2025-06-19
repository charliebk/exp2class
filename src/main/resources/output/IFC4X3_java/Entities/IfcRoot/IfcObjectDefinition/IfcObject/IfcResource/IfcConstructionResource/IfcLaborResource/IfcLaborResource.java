public class IfcLaborResource extends IfcConstructionResource {
    public IfcLaborResourceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcLaborResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLaborResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
