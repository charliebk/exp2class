public class IfcGeographicElementType : IfcElementType
{
    public IfcGeographicElementTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcGeographicElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcGeographicElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
