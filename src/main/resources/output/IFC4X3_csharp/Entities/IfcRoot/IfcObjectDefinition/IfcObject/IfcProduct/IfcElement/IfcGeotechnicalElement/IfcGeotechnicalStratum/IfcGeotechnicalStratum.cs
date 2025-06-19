public class IfcGeotechnicalStratum : IfcGeotechnicalElement
{
    public IfcGeotechnicalStratumTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcGeotechnicalStratumTypeEnum.USERDEFINED) OR ((PredefinedType = IfcGeotechnicalStratumTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
