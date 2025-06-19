public class IfcRampFlightType extends IfcBuiltElementType {
    public IfcRampFlightTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRampFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRampFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
