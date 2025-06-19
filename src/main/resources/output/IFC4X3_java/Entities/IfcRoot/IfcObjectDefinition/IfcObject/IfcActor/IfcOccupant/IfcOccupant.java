public class IfcOccupant extends IfcActor {
    public IfcOccupantTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // WR31 : NOT(PredefinedType = IfcOccupantTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
