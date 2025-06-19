public class IfcDistributionSystem : IfcSystem
{
    public IfcLabel LongName { get; set; }
    public IfcDistributionSystemEnum PredefinedType { get; set; }

    // === EXTENDED BY ===
    // IfcDistributionCircuit

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDistributionSystemEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionSystemEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
