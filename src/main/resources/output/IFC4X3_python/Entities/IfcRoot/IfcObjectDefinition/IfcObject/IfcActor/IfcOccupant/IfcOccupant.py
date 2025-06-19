class IfcOccupant(IfcActor):
    def __init__(self):
        self.PredefinedType: IfcOccupantTypeEnum = None

    # === WHERE CLAUSES ===
    # WR31 : NOT(PredefinedType = IfcOccupantTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
