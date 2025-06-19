class IfcActor(IfcObject):
    def __init__(self):
        self.TheActor: IfcActorSelect = None

    # === EXTENDED BY ===
    # IfcOccupant

    # === INVERSE CLAUSES ===
    # IsActingUpon : SET [0:?] OF IfcRelAssignsToActor FOR RelatingActor
