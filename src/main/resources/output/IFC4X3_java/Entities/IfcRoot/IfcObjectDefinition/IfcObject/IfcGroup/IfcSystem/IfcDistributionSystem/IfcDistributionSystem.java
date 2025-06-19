public class IfcDistributionSystem extends IfcSystem {
    public IfcLabel LongName;
    public IfcDistributionSystemEnum PredefinedType;

    // === EXTENDED BY ===
    // IfcDistributionCircuit

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDistributionSystemEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionSystemEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
