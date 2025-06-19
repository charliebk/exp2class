public class IfcCrewResource : IfcConstructionResource
{
    public IfcCrewResourceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCrewResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCrewResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
