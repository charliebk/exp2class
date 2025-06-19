class IfcRelSequence(IfcRelConnects):
    def __init__(self):
        self.RelatingProcess: IfcProcess = None
        self.RelatedProcess: IfcProcess = None
        self.TimeLag: IfcLagTime = None
        self.SequenceType: IfcSequenceEnum = None
        self.UserDefinedSequenceType: IfcLabel = None

    # === WHERE CLAUSES ===
    # AvoidInconsistentSequence : RelatingProcess :<>: RelatedProcess
    # CorrectSequenceType : (SequenceType <> IfcSequenceEnum.USERDEFINED) OR ((SequenceType = IfcSequenceEnum.USERDEFINED) AND EXISTS(UserDefinedSequenceType))
