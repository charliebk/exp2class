class IfcOccupant extends IfcActor {
    constructor() {
        /** @type {IFCOCCUPANTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // WR31 : NOT(PredefinedType = IfcOccupantTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
