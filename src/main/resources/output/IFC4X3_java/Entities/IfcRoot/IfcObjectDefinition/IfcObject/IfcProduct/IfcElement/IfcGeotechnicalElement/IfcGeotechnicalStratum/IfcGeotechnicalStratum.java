public class IfcGeotechnicalStratum extends IfcGeotechnicalElement {
    public IfcGeotechnicalStratumTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcGeotechnicalStratumTypeEnum.USERDEFINED) OR ((PredefinedType = IfcGeotechnicalStratumTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
