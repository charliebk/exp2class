class IfcTypeProcess(IfcTypeObject):
    def __init__(self):
        self.Identification: IfcIdentifier = None
        self.LongDescription: IfcText = None
        self.ProcessType: IfcLabel = None

    # === EXTENDED BY ===
    # IfcEventType
    # IfcProcedureType
    # IfcTaskType

    # === INVERSE CLAUSES ===
    # OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess
