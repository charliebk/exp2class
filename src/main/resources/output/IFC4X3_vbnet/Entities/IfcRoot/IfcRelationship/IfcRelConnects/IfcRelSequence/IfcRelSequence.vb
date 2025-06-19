Public Class IfcRelSequence Inherits IfcRelConnects
    Public RelatingProcess As IfcProcess
    Public RelatedProcess As IfcProcess
    Public TimeLag As IfcLagTime
    Public SequenceType As IfcSequenceEnum
    Public UserDefinedSequenceType As IfcLabel

    ' === WHERE CLAUSES ===
    ' AvoidInconsistentSequence : RelatingProcess :<>: RelatedProcess
    ' CorrectSequenceType : (SequenceType <> IfcSequenceEnum.USERDEFINED) OR ((SequenceType = IfcSequenceEnum.USERDEFINED) AND EXISTS(UserDefinedSequenceType))
End Class
