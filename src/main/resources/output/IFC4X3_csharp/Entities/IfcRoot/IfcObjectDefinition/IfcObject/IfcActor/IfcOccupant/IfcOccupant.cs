public class IfcOccupant : IfcActor
{
    public IfcOccupantTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // WR31 : NOT(PredefinedType = IfcOccupantTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
