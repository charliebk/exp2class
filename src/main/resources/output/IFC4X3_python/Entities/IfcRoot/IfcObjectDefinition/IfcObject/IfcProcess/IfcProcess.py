class IfcProcess(IfcObject):
    def __init__(self):
        self.Identification: IfcIdentifier = None
        self.LongDescription: IfcText = None

    # === EXTENDED BY ===
    # IfcEvent
    # IfcProcedure
    # IfcTask

    # === INVERSE CLAUSES ===
    # IsPredecessorTo : SET [0:?] OF IfcRelSequence FOR RelatingProcess
    # IsSuccessorFrom : SET [0:?] OF IfcRelSequence FOR RelatedProcess
    # OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess
